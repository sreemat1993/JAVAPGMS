package com.example;

public class Compute {
	
	public Object returnObj(String type)
	{
		if(type=="mobile")
		{
			return new ARM();
		}
		if(type=="desktop")
		{
			return new Processor();
		}
		return null;
	}

}
