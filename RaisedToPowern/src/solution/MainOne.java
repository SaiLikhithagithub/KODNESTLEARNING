package solution;

public class MainOne {
	public static void powerToTwo(int num,int power)
	{
		int res=1;
		for(int i=1;i<=power;i++)
		{
			 res=res*num;
		}
		System.out.println(res);
	}
}
