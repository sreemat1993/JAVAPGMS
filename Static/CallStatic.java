package com.example;

public class CallStatic extends ExampleStaticMethod {
	public void call()
	{
		staticName();
	}
	public static void main(String agr[])
	{
		CallStatic c1=new CallStatic();
		c1.call();
	}
}
