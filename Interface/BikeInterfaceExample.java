package com.example;

public class BikeInterfaceExample implements Vechile {

	public void start() {
		System.out.println("Bike Started...");	
		}

		public void stop() {
			System.out.println("Bike Stopped...");
			
		}

		public void run() {
			System.out.println("Bike running...");
			
		}
		public static void main(String[] arg)
		{
			BikeInterfaceExample bifx=new BikeInterfaceExample();
			bifx.start();
			bifx.stop();
			bifx.run();
		}
}
