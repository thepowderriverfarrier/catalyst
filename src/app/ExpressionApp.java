package app;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.ExprLexer;
import antlr.ExprParser;
import antlr.ExprParser.ProgramContext;
import expression.AntlrToProgram;
import expression.ExpressionProcessor;
import expression.Program;

//this in effect is the compiler application

public class ExpressionApp {

	public static void main(String[] args) {

		if(args.length !=1 ) {
			System.err.println("Usage: file name should be entered.");
		}
		else {
			String fileName = args[0];
			ExprParser parser = getParser(fileName);
			
			//instruct ANTLR to build parse tree and start paring at 'prog' on the object tree
			ParseTree antlrAST = parser.prog();
			//create visitor for converting parse tree to expression objects
			AntlrToProgram progVisitor = new AntlrToProgram();
			Program prog = progVisitor.visit(antlrAST);
			
			if(progVisitor.semanticErrors.isEmpty()) {
				ExpressionProcessor ep = new ExpressionProcessor(prog.expressions);
				for(String evaluation: ep.getEvaluationResults()) {
					System.out.println(evaluation);
				}
			}
			else {
				for(String err: progVisitor.semanticErrors) {
					System.out.println(err);
				}
			}
			
			
		}

	}
	
	//same for all applications;  just change prefix as parser and lexer are specific to grammar file
	private static ExprParser getParser(String fileName) {
		
		ExprParser parser = null;
		
		
		try {
		CharStream input = CharStreams.fromFileName(fileName);
		ExprLexer lexer = new ExprLexer(input);
		//TokenSource tokenSource;
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		parser = new ExprParser(tokens);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return parser;
	}

}
