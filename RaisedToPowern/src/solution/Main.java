package solution;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=scan.nextInt();
		System.out.println("Enter power ");
		int power=scan.nextInt();
		scan.close();
		MainOne.powerToTwo(num,power);
	}

}
