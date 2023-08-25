package com.kodnest.constructorOverloading;

public class Mobile {
	String brand;
	String color;
	int cost;
	
	public Mobile(String x,String y,int z)
	{
		brand=x;
		color=y;
		cost=z;
	}
	public Mobile(String q)
	{
		brand=q;
	}
	public Mobile()
	{
		brand="oneplus";
		cost=34000;
	}
	
	void allowToCall()
	{
		System.out.println("Calling....");
	}
	void allowToPay()
	{
		System.out.println("Paid...");
	}
}
