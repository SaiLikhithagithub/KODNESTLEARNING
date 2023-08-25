package solution;

import java.util.Scanner;

public class StringJoinerTask {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first and last name:");
		String firstName=scan.next();
		String lastName=scan.next();
		scan.close();
		System.out.println(joinStrings(firstName,lastName));
	}
	public static String joinStrings(String str1, String str2)
	{
		return str1+" "+str2;
	}
}
