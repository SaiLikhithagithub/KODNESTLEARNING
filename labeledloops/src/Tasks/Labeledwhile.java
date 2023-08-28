package Tasks;

public class Labeledwhile {

	public static void main(String[] args) {
		int m=1;
		ram : while(m<=5)
		{
		int n=1;
		sita:while(n<=5)
		{
			System.out.println("Kodnest");
			n++;
			break ram;
		}
		System.out.println();
		m++;
		}
	}

}
