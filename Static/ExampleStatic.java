package com.example;

public class ExampleStatic {
	static int count=0;
	ExampleStatic()
	{
		count++;
	}
	public static void main(String arg[])
	{
		ExampleStatic e1=new ExampleStatic();
		ExampleStatic e2=new ExampleStatic();
		ExampleStatic e3=new ExampleStatic();
		System.out.println(count +" Object(s) are created for the class ExampleStatic");
	}

}
