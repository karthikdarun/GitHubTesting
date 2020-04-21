package com.sample;

public class SampleString {
	
	public static void main(String agrs[])
	{
		String firstName = "karthik";
		String lastName= "Raja";
		
		boolean compare = firstName.equals(lastName);
		
		System.out.println(compare);
				
		String fullName =  firstName.concat(lastName);
		
		String caps = fullName.toUpperCase();
		System.out.println(caps);
		
		int length = fullName.length();
		
		System.out.println(fullName);
		
		System.out.println(length);
		
		if (firstName.equals("karthik"))
		{
			System.out.println("Name is correct");
		}else
		{
			System.out.println("Name is wrong");
		}
		
	}

}
