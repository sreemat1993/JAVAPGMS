package com.example;

public class ComputingMain {
	
	public static void main(String arg[])
	{
		Compute cmp= new Compute();
		Computing cp=(Computing) cmp.returnObj("mobile");
		cp.howToCompute();
		cp.processMang();
		cp.memMang();
		cp=(Computing) cmp.returnObj("desktop");
		cp.howToCompute();
		cp.processMang();
		cp.memMang();
	}
	

}
