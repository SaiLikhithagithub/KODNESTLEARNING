package com.kodnest.methods;

public class MethodOverloading {

	public static void main(String[] args) {
		teaBill();
		teaBill("Ginger");
		teaBill(5);
		teaBill("Ilachi",10);
	}
	
	public static void teaBill()
	{
		System.out.println("Cost of teabill is 10Rs");
	}
	public static void teaBill(int n)
	{
		System.out.println("Cost of "+n+"teabill is:"+(n*10));
	}
	public static void teaBill(String n,int m)
	{
		System.out.println("Cost of "+m+" "+n+"tea bill is:"+(m*15));
	}
	public static void teaBill(String n)
	{
		System.out.println("Cost of "+n+"teabill is:15Rs");
	}

}
