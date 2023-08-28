package solution;

import java.util.Scanner;
//traiangle, Quadrilateral,Pentagon and Hexagon. By defalut 
//any other let the program print Polygon

public class Main
{
	public static void identifyPolygon(int sides)
	{
		// your code here
		switch(sides)
		{
		case 3:
			System.out.println("triangle");
			break;
		case 4:
			System.out.println("Quadrilateral");
			break;
		case 5:
			System.out.println("Pentagon");
			break;
		case 6:
			System.out.println("Hexagon");
			break;
		default:
			System.out.println("Polygon");
		}
	}

	public static void main(String[] args)
	{
		//Taking the input and method call here.
		Scanner scan=new Scanner(System.in);
		int sides=scan.nextInt();
		identifyPolygon(sides);
		scan.close();
	}
}