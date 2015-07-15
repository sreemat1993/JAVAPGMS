package com.example;

public class CommandLineArg {
	public static void main(String arg[])
	{
		System.out.println("The Sum of two number is " + (Integer.parseInt(arg[0])+Integer.parseInt(arg[1])));
		System.out.println("The Differnce between two number is " + (Integer.parseInt(arg[0])-Integer.parseInt(arg[1])));
		System.out.println("The Multiplication of two number is " + (Integer.parseInt(arg[0])*Integer.parseInt(arg[1])));
		System.out.println("The Division of two number is " + (Integer.parseInt(arg[0])/Integer.parseInt(arg[1])));
	}

}
