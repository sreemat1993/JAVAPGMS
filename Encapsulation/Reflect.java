package com.example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflect {

	public static void main(String[] args) {
		Class encp = Encap.class;
		System.out.println(encp.getPackage());
		System.out.println(encp.getName());
		Method[] met=encp.getDeclaredMethods();
		System.out.println(Arrays.toString(met));
		Field[] fed=encp.getFields();
		System.out.println(Arrays.toString(fed));
	}

}
