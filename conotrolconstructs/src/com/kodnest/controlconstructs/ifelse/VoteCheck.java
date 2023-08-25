package com.kodnest.controlconstructs.ifelse;

import java.util.Scanner;

public class VoteCheck {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=scan.nextInt();
		scan.close();
		if(age>=18)
		{
			System.out.println("You are eligible for voting");
		}
		else
		{
			System.out.println("You are not eligible for voting");
		}
	}

}
