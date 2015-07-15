package com.example;

public class CarInterfaceExample implements Vechile {

	public void start() {
	System.out.println("Car Started...");	
	}

	public void stop() {
		System.out.println("Car Stopped...");
		
	}

	public void run() {
		System.out.println("Car running...");
		
	}
	public static void main(String[] arg)
	{
		CarInterfaceExample cifx=new CarInterfaceExample();
		cifx.start();
		cifx.stop();
		cifx.run();
	}

}
