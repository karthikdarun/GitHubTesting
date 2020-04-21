package com.sample;

public class ForLoop {
	

public static void main(String args[])

{
	/*String [] carbrand = new String [6];
	carbrand[0] = "BMW";
	carbrand[1] = "TATA";
	carbrand[2] = "AUDI";
	carbrand[3] = "HYUNDAI";
	carbrand[4] = "MARUTHI";
	carbrand[5] = "HONDA";*/
	
	
	String carbrand[] = {"BMW","AUDI","HONDA","TATA","MAHINDRA"};
 	int totalLengh = carbrand.length;
	
	System.out.println("Total Array size is :" +totalLengh);
	
	/*for (int i = 0; i<carbrand.length;i++)
	{
		System.out.println("carbrand position at " + i +" "+ carbrand[i]);
	}*/
	
	for(String carName:carbrand)
	{
		System.out.println("Car name is "+ carName );
	}
}
}
