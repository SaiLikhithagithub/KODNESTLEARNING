package solution;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		scan.close();
		calculateDigits(num);
	}
	
	public static void calculateDigits(int num)
	{
		int sum=0;
		
		while(num>0)
		{
			int lastdigit=num%10;
			sum=sum+lastdigit;
			num=num/10;
		}
		System.out.println(sum);
	}
	
}
