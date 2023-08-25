package com.kodnest.conotrolconstructs.simpleif;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter marks:");
		int marks=scan.nextInt();
		scan.close();
		System.out.println("Welcome to kodnest");
		if(marks>=80)
		{
			System.out.println("Welcome to Tech club");
		}
	}

}
