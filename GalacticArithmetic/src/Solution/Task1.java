package Solution;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long num1=scan.nextLong();
		long num2=scan.nextLong();
		scan.close();
		System.out.println(galacticAddition(num1,num2));
	}

	public static long galacticAddition(long num1, long num2)
	{
		return num1+num2;
	}

}
