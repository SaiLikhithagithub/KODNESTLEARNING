package solution2;

public class Power {
	public int noofdigits(int num)
	{
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		return count;
	}
	public int result(int num)
	{
		int finalresult=1;
		int count=noofdigits(num);
		for(int i=1;i<=count;i++)
		{
			finalresult=finalresult*num;
		}
		return finalresult;
}
}
