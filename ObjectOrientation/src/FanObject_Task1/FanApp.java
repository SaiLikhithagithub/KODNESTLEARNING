package FanObject_Task1;

public class FanApp {
	public static void main(String[] args) {
		Fan f1=new Fan();
		Fan f2=new Fan();
		Fan f3=new Fan();
		
		f1.no_Of_Wings=3;
		f1.color="red";
		f1.brand="Usha";
		f1.cost=3000;
		System.out.println(f1.no_Of_Wings+" "+f1.color+" "+f1.brand+" "+f1.cost);
		f1.blow_Air();
		f1.rotate();
		
		System.out.println("===============================");
		
		f2.no_Of_Wings=4;
		f2.color="blue";
		f2.brand="crompton";
		f2.cost=4000;
		System.out.println(f2.no_Of_Wings+" "+f2.color+" "+f2.brand+" "+f2.cost);
		f2.blow_Air();
		f2.rotate();
		
		System.out.println("===============================");
		
		f3.no_Of_Wings=3;
		f3.color="brown";
		f3.brand="crompton";
		f3.cost=6000;
		System.out.println(f3.no_Of_Wings+" "+f3.color+" "+f3.brand+" "+f3.cost);
		f3.blow_Air();
		f3.rotate();
	}

}
