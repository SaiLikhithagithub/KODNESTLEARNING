package com.kodnest.methods;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Name:");
		String s=scan.nextLine();
		scan.close();
		greet(s);
	}
	public static void greet(String n)
	{
		System.out.println("Hello "+n+" ...How Are You...");
	}
}
