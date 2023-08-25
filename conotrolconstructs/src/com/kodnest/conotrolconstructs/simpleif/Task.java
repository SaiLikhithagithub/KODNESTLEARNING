package com.kodnest.conotrolconstructs.simpleif;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter marks:");
		int marks=scan.nextInt();
		scan.close();
		System.out.println("Welcome to kodnest");
		Task t=new Task();
		t.check(marks);
		
	}
	 void check(int marks)
	{
		if(marks>=80)
		{
			System.out.println("Welcome to tech club");
		}
	}

}
