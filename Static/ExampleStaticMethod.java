package com.example;

public class ExampleStaticMethod {
	
	public static void staticName()
	{
		System.out.println("staticName () Static method called");
	}
	public void Name()
	{
		System.out.println("Name() method called");
		staticName();
	}
	/*public static void main(String arg[])
	{
		ExampleStaticMethod e1= new ExampleStaticMethod();
		e1.Name();
	}*/
}
