package com.test;

public class PolyTest {
	
	public void eat()
	{
		System.out.println("Animals can eat");
	}	
	
	public void sleep()
	{
		System.out.println("Animals can sleep");
	}
}

 class Dog extends PolyTest
{
	public void eat()
	{
		System.out.println("Dogs can eat food");
	}
}
 
 class Cat extends Dog{
	 public void run()
	 {
		 System.out.println("Cat can run fastly");
	 }
 }
 
 
