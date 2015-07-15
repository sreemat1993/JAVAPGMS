package com.example;

public class CallStaticMethod {
	
	public void call()
	{
		ExampleStaticMethod.staticName();
	}
	public static void main(String agr[])
	{
		CallStaticMethod c1=new CallStaticMethod();
		c1.call();
	}

}
