package com.kodnest.methods;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter Name and year of birth:");
			String s=scan.nextLine();
			int yob=scan.nextInt();
			scan.close();
			greet(s);
			int res=age(yob);
			System.out.println("You are "+res+" old.");
	}
		public static void greet(String n)
		{
			System.out.println("Hello "+n+" ...");
		}
		public static int age(int yob)
		{
			return (2023-yob);
		}
}
