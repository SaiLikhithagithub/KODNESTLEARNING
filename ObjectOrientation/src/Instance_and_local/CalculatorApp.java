package Instance_and_local;

public class CalculatorApp {
	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.num1=10;
		c.num2=20;
		c.add();
		c.mul();
		c.div();
		c.sub();
		c.rem();
	}

}
