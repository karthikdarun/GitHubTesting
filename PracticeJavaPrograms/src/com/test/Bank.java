package com.test;

public class Bank {

	public float getInterestRate()
	{
		return 0.0f;
	}
}

class Axis extends Bank
{
	public float getInterestRate()
	{
		return 8.5f;
	}
}

class Sbi extends Bank
{
	public float getInterestRate()
	{
		return 8.9f;
		
	}
}

class Hdfc extends Bank
{
	public float getInterestRate()
	{
		return 9.8f;
		
	}
}
