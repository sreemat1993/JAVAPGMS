package com.example;

public class StringExample {

	public static void main(String[] args) {
		String a="";
		a="sreemat sreemat sreemat";
		System.out.println(a.charAt(10));
		System.out.println(a.indexOf('r'));
		System.out.println(a.startsWith("sreemat"));
		System.out.println(a.length());
		System.out.println(a.lastIndexOf('s'));
		System.out.println(a.lastIndexOf('t', 12));
		

	}

}
