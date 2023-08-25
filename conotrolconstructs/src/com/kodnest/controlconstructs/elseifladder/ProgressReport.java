package com.kodnest.controlconstructs.elseifladder;

import java.util.Scanner;

public class ProgressReport {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter marks");
		int marks=scan.nextInt();
		scan.close();
		if(marks>=90)
		{
			System.out.println("Grade A");
		}
		else if(marks>=80&&marks<90)
		{
			System.out.println("Grade B");
		}
		else if(marks>=70&&marks<80)
		{
			System.out.println("GRade C");
		}
		else if(marks>=60&&marks<70)
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Failed");
		}
	}

}
