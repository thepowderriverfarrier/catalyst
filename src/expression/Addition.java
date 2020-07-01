package expression;

public class Addition extends Expression {

	//allow for more complicated expressions
	Expression left;
	Expression right;
	
	public Addition(Expression left, Expression right) {
		this.left = left;
		this.right = right;	
	}
	
	@Override
	public String toString() {
		return left.toString() +  " + " + right.toString();
	}
}
