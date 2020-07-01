package expression;

import java.util.ArrayList;
import java.util.List;

import antlr.ExprBaseVisitor;
import antlr.ExprParser.ProgramContext;

public class AntlrToProgram extends ExprBaseVisitor<Program> {

	//retrieve first, second and third child from samples using expression method
	
	
	public List<String> semanticErrors; //semantic errors list accessed by main application program
	
	
	@Override  //to visit the root of the parse tree,  this is the first visit method to be called
	//and turn the program node of the parse tree into a program object
	public Program visitProgram(ProgramContext ctx) {
			
		//don't automatically know how many children the program context has so turn it into prog object
		// for every child node of the parent app recursively visit it resulting in an expression for
		// each parse tree node visited
		
		Program prog = new Program();
		
		semanticErrors = new ArrayList<>();
		
		AntlrToExpression exprVisitor = new AntlrToExpression(semanticErrors);//helper visitor for
		//transforming each sub tree into expression object
		
		
		for(int i = 0; i < ctx.getChildCount(); i++) {
			if(i == ctx.getChildCount() -1) {
				//last child of start symbol so it is not used
			}
			else {
				//use general visit to further delegate to appropriate visitor method
				prog.addExpression(exprVisitor.visit(ctx.getChild(i)));
			}
		}
		
		return prog;
	}

	
}
