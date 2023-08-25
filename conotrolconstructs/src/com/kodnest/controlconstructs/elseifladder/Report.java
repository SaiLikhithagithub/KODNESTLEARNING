package com.kodnest.controlconstructs.elseifladder;

import java.util.Scanner;

public class Report {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int marks=scan.nextInt();
		scan.close();
		//ReportApp res=new ReportApp();
		//res.correction(marks);
		ReportApp.correction(marks);
	}

}
