package solution;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=scan.nextInt();
		scan.close();
		Solution s=new Solution();
		int digits=s.noofdigi(num);
		int result=s.calculation(num, digits);
		if(result==num)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not an armstrong number");
		}
	}

}
