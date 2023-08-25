package com.kodnest.constructorOverloading;

public class MobileApp {

	public static void main(String[] args) {
		Mobile m1=new Mobile("Samsung","Gold",34500);
		System.out.println(m1.brand+" "+m1.color+" "+m1.cost);
		m1.allowToPay();
		m1.allowToCall();
		Mobile m2=new Mobile("Oppo");
		System.out.println(m2.brand);
		Mobile m3=new Mobile();
		System.out.println(m3.brand+" "+m3.cost);
	}

}
