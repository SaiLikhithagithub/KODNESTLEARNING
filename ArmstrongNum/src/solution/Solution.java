package solution;

public class Solution {
	int calculation(int num,int digits)
	{
		int finalsum=0;
		int original=num;
		while(original>0)
		{
			
			int lastdigi=original%10;
			int temp=1;
			for(int i=1;i<=digits;i++)
			{
				temp=temp*lastdigi;
			}
			finalsum=finalsum+temp;
			original=original/10;
		}
		return finalsum;
	}
	
	
	
	
	int noofdigi(int num)
	{
		int count=0;
		while(num>0)
		{
		num=num/10;
		count++;
		}
		return count;
	}
}
