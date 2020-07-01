package expression;

public class Number extends Expression {
	int num;
	
	//create number object
	public Number(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		//return to string value for a number
		//  by new Integer class created out of num
		return new Integer(num).toString();
	}

}
