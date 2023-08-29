package solution;

public class MainApp {
	public static void countDigits(int num)
	{
		int count=0;
		while(num>0)
		{
		num=num/10;
		count=count+1;
		}
		System.out.println(count);
		
	}
}
