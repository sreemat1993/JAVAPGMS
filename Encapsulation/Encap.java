package com.example;

public class Encap {
	private int age=21;
	private String name="sreemat";
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display()
	{
		System.out.println("My Name is "+name+" and My age is "+age);
	}
}
