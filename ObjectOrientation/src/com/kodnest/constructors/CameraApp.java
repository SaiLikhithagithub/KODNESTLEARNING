package com.kodnest.constructors;

public class CameraApp {

	public static void main(String[] args) {
		Camera c1=new Camera("Canon","White",45000);
		c1.displayImage();
		c1.captureImage();
	}

}
