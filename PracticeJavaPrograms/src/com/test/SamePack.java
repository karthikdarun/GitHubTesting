package com.test;



public class SamePack {
	
	public static void main(String args[])
	{
		Car c1 = new Car();
		c1.gear = 4;
		c1.model = "Santro";
		System.out.println(c1.gear + " " + c1.model);
		c1.speed();

}

}
