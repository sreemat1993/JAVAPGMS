package com.example;

public class ExampleLocal {

	int age = 22;

	public void setAge(int age) {
		System.out.println("Before Local :" + age);
		System.out.println("Before Instance :" + this.age);
		this.age = age;
		age = 40;
		System.out.println("After Local :" + age);
		System.out.println("After Instance :" + this.age);
	}

	public static void main(String arg[]) {
		ExampleLocal e1 = new ExampleLocal();
		e1.setAge(19);
	}
}
