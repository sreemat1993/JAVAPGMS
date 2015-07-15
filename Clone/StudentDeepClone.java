package com.example;

public class StudentDeepClone implements Cloneable {
	String name="SREEMAT";
	int age=22;
	SubjectDeepClone sdc;
	public void study()
	{
		System.out.println("Later");
	}
	public void exam()
	{
		System.out.println("Bunk");
	}
	public Object clone(int i) throws CloneNotSupportedException
	{
		if(i==1)
		{
			//Shallow clone
			return super.clone();
		}
		else
		{// Deep clone
			SubjectDeepClone sd=new SubjectDeepClone();
			sd.number=3;
			sd.sub_name[0]="MATHS";sd.sub_name[1]="SCIENCE";sd.sub_name[2]="SOCIAL";
			StudentDeepClone stc=(StudentDeepClone)super.clone();
			stc.sdc=sd;
			return stc;
		}
	}
	@Override
	public String toString() {
		return "StudentDeepClone [name=" + name + ", age=" + age + ", sdc="
				+ sdc + "]";
	}

}
