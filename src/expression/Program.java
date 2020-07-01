package expression;

import java.util.ArrayList;
import java.util.List;

public class Program {
//should contain a list of expressions
	
	public List<Expression> expressions;
	
	//constructor with no expressions initially
	public Program() {
		this.expressions = new ArrayList<>();
	}
	
	//mutator
	public void addExpression(Expression e) {
		expressions.add(e);
	}
	
}
