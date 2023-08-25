package com.kodnest.constructors;

public class Camera {
	String brand;
	String color;
	int cost;
	
	public Camera(String x,String y,int z)
	{
		brand=x;
		color=y;
		cost=z;
	}
	
	void captureImage()
	{
		System.out.println("Captured image");
	}
	void displayImage()
	{
		System.out.println(brand+" brand "+" color "+color+" with "+cost+" Rs is displaying image");
	}
}
