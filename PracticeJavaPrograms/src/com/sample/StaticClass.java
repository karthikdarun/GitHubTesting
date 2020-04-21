package com.sample;

public class StaticClass {

	static int age;
	static final String name = "Karthik";
	String place;
	
	public final void display()
	{
		System.out.println("This is not static method");
		StaticClass.age = 10;
		//StaticClass.name = "KArthik";
	System.out.println("Age is "+ age + ""+ "Name is "+ name+"Place is "+place);	
	
	StaticClass.info();
	}
	
	public static  void info()
	{
		System.out.println("This is a static method");
		StaticClass.age = 19;
		//StaticClass.name = "Raja";
	System.out.println("Age is "+ age + ""+ "Name is "+ name);
	
	}
	
	
}
