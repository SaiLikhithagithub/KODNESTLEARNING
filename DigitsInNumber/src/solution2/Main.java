package solution2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=scan.nextInt();
		scan.close();
		Power p=new Power();
		int output=p.result(num);
		System.out.println(output);
	}
}
