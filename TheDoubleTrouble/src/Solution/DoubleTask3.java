package Solution;

import java.util.Scanner;

public class DoubleTask3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		scan.close();
		System.out.println(doubleTheNumber(num));
	}
	public static int doubleTheNumber(int num)
	{
		return 2*num;
	}
}
