package com.sample;

public class SplitClass {
	
	public static void main (String args[])
			{
		String s1 = "Karthikraj,lives,in,chennai,town";
		String[] arr = s1.split(",",4);
		for(String s2:arr)
		{
			System.out.println(s2);
		}
		
			}

}
