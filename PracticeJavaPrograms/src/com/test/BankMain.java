package com.test;

public class BankMain {

	public static void main (String args[])
	{
		Bank b;
	 	b= new Axis();		
		System.out.println("AXIS interest is "+b.getInterestRate());
		b= new Sbi();
		System.out.println("SBI interest is "+b.getInterestRate());
		b= new Hdfc();
		System.out.println("HDFC interest is "+b.getInterestRate());
	}
}
