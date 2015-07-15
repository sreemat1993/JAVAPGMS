package com.example;

import java.util.Arrays;

public class SubjectDeepClone {
int number=3;
String sub_name[]={"Maths","Science","Social"};
public void display()
{
System.out.println("Number of subjects :"+number+"\t Subject Names :"+ ArrayString());
}
public String ArrayString()
{
String temp="[";
for(String tem:sub_name)
{
	temp+=tem +" ";
}
return temp+"]";
}
public static void main(String arg[])
{
	SubjectDeepClone sdc=new SubjectDeepClone();
	sdc.display();
}
@Override
public String toString() {
	return "SubjectDeepClone [number=" + number + ", sub_name="
			+ Arrays.toString(sub_name) + "]";
}
}
