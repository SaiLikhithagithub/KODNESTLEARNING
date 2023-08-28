package Tasks;

public class LabeleddoWhile {

	public static void main(String[] args) {
		int m=1;
		ram : do
		{
		int n=1;
		sita:do
		{
			System.out.println("Kodnest");
			n++;
			break ram;
		}while(n<=5);
		System.out.println();
		m++;
		}while(m<=5);
	}
	}


