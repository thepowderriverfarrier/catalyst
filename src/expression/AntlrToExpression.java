package expression;


import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import antlr.ExprBaseVisitor;
import antlr.ExprParser.AdditionContext;
import antlr.ExprParser.DeclarationContext;
import antlr.ExprParser.MultiplicationContext;
import antlr.ExprParser.NumberContext;
import antlr.ExprParser.VariableContext;

public class AntlrToExpression extends ExprBaseVisitor<Expression>{
	
	//all visit methods are called in top down fashion so the
	//  order in which they added to <List> vars below is
	//  same order as they are declared in input program
	//  i: INT = 5 is first declaration and i: INT = 7 is second
	
	//WAY NODES ARE VISITED CORRESPONDFS TO THE ORDER OF LINES IN THE INPUT PROGRAM
	//  this supports semantic error checking  (if var declared more than once or not at all)
	
	private List<String> vars; //store all variables declared in program
    private List<String> semanticErrors; //duplicate or non-declared
	
    //avoid null pointer exceptions by initializing
    public AntlrToExpression(List<String> semanticErrors) {
    	vars = new ArrayList<>();
    	this.semanticErrors = semanticErrors;
    	
    }
    
	
	@Override
	//using i: INT = 5 as the example
	public Expression visitDeclaration(DeclarationContext ctx) {
		//get line and column number for errors,  ID() is method corresponding to source grammar
		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;  //count starts at zero
		
		String id = ctx.getChild(0).getText();
		//maintain vars list
		if (vars.contains(id)) {
			semanticErrors.add("Error in: variable " + id + " already declared (" + line + ", " + column + ")");
		}
		else {
			vars.add(id);
		}
		
		//retrieve other children
		String type = ctx.getChild(2).getText();
		int value = Integer.parseInt(ctx.NUM().getText());
		
		return new VariableDeclaration(id, type, value);
	}

	@Override
	public Expression visitMultiplication(MultiplicationContext ctx) {
		
		Expression left = visit(ctx.getChild(0)); //since can't convert from parse tree to expression directly
		//  have to recursively visit left subtree of multiplication node
		Expression right = visit(ctx.getChild(2)); //same as left
		
		return new Multiplication(left, right);
	}

	@Override
	public Expression visitAddition(AdditionContext ctx) {
		Expression left = visit(ctx.getChild(0)); //since can't convert from parse tree to expression directly
		//  have to recursively visit left subtree of multiplication node
		Expression right = visit(ctx.getChild(2)); //same as left
		
		return new Addition(left, right);
	}

	@Override
	public Expression visitVariable(VariableContext ctx) {
		 
		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;
		
		String id = ctx.getChild(0).getText();
		if(!vars.contains(id)) {
			semanticErrors.add("Error in: variable " + id + " not declared (" + line + ", " + column + ")");
		}
		
		return new Variable(id);
 	}

	@Override
	public Expression visitNumber(NumberContext ctx) {
		//get child of node and convert text to number
		String numText = ctx.getChild(0).getText();
		int num = Integer.parseInt(numText);
		//number subclass
		return new Number(num);
		
	}
	
	//override expected methods using right click and source
	
};