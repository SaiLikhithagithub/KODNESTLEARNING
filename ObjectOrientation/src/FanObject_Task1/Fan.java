package FanObject_Task1;

public class Fan {
	int no_Of_Wings;
	String color;
	int cost;
	String brand;
	
	public void rotate()
	{
		System.out.println("Fan of "+color+" color "+brand+" brand "+no_Of_Wings+" wings "+cost+" Rs");
	}
	public void blow_Air()
	{
		System.out.println(color+"color fan is blowing air.");
	}
}
