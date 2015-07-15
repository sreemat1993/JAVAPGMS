package com.example;

public class Mobile extends Phone {
	String mob_name="Moto";
	String type="touch";
	public void playGame()
	{
		System.out.println("Play Game");
	}
	public void browseInternet()
	{
	System.out.println("Search any thing..!!");	
	}
	public void dailCall()
	{
		//super.dailCall();
		System.out.println("Moblie Dailing...");
	}
	public void phoneDailCall()
	{
		super.dailCall();
	}
	public static void main(String arg[])
	{
		Mobile mb=new Mobile();
		mb.playGame();
		mb.receiveCall();
		mb.phoneDailCall();
		Phone ph=new Mobile();
		ph.dailCall();
	}
	}
