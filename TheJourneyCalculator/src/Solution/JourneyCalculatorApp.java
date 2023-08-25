package Solution;

import java.util.Scanner;

public class JourneyCalculatorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		scan.close();
		JourneyCalculator j=new JourneyCalculator();
		System.out.println(j.calculateDistance(speed, time));
	}

}
