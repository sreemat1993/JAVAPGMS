package com.example;

import java.util.*;

public class Array {

	public int[] getArray()
	{
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array value");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		return a;
	}
	public static void main(String[] args) {
		Array ay=new Array();
		int a[]=new int[5];
		a=ay.getArray();
		System.out.println("Value in the array");
		for(int temp:a)
		{
			System.out.println(temp);
		}

	}

}
