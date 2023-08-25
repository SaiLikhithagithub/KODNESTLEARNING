package com.kodnest.Scannerclass;

import java.util.Scanner;
public class Takingip {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Student First Name");
		String a=scan.next();
		System.out.println("First name : "+a);
		
		System.out.println("Enter Student last Name");
		String b=scan.next();
		System.out.println("last name : "+b);
		
		System.out.println("Enter students Age");
		int c=scan.nextInt();
		System.out.println("Age is: "+c);
		
		System.out.println("Enter Students gender");
		String d=scan.next();
		System.out.println("Gender is : "+d);
		
		System.out.println("Is student Married? say True or False");
		boolean e = scan.nextBoolean();
		System.out.println("Status: "+e);
		
		System.out.println("Enter Student branch:");
		String f=scan.next();
		System.out.println("branch is :"+f);
		
		System.out.println("Enter student height:");
		float g=scan.nextFloat();
		System.out.println("height is:"+g);
		
		System.out.println("Enter student weight:");
		float h=scan.nextFloat();
		System.out.println("Weight is:"+h);
		scan.close();
	}

}
