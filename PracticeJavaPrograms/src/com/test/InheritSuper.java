package com.test;

public class InheritSuper {
	
	String name;
	String color;
	
	public InheritSuper(String name) {
		this.name = name;		
	}
	
	public void move()
	{
		System.out.println("animals can move");
	}
	
	public void eat()
	{
		this .move();
		System.out.println("Animals can eat");
	}

}
