package TableObject;

public class TableApp {

	public static void main(String[] args) {
		Table t1=new Table();
		t1.seatingCapacity=3;
		t1.color="brown";
		t1.cost=3000;
		t1.brand="Slipha";
		t1.allowToSit();
		t1.allowToWrite();
		System.out.println(t1.seatingCapacity+" "+t1.cost+" "+t1.brand+" "+t1.color);
	}

}
