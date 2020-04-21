package com.test;

public class Except {
	
	public int div(int a, int b) throws ArithmeticException 
	{
		int t = a/b;
		return t;
	}
	
	
	
	
	
	
	public static void main (String args[])
	{
		
		Except ex = new Except();
		try
		{
			System.out.println(ex.div(5, 0));
						
	
}
		
	catch (ArithmeticException e)
		{
			System.out.println("You should not divide number by Zero");
		}
		finally {
			System.out.println("This will be exceuted always");
		}
	}

}