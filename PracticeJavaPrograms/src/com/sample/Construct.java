package com.sample;

public class Construct {
	
		int age;
		String name;
		public Construct(int empAge, String empName)
		{
			this.age=empAge;
			this.name = empName;
			System.out.println("Age is "+ empAge +" and "+ "Name is " +empName);
		}
		
		public void diplay()
		{
			int age = 30;
			String name = "Karthik";
			System.out.println("This is display method "+ "Age is "+ age + " "+ "Name is "+name);
	
		
		}
		public static void main (String args[])
		{
			Construct c = new Construct(40, "Raja");
			c.diplay();
		}
	}


