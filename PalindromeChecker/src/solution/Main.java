package solution;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int original=scan.nextInt();
		scan.close();
		MainApp res=new MainApp();
		res.palindrome(original);
	}

}
