package com.example;

public class DeepClone {
public static void main(String arg[]) throws CloneNotSupportedException
{
	StudentDeepClone st1=new StudentDeepClone();
	//Shallow clone
	StudentDeepClone st2=(StudentDeepClone) st1.clone(1);
	//deep clone
	StudentDeepClone st3=(StudentDeepClone) st1.clone(2);
	System.out.println(st1.toString());
	System.out.println(st2.toString());
	System.out.println(st3.toString());
	
}


}
