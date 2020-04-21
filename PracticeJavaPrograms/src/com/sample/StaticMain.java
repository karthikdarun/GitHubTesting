package com.sample;

public class StaticMain extends StaticClass {
	public static void main (String args[])
	
	{
				
		StaticClass s= new StaticClass();
		StaticChild c = new StaticChild();
		s.place = "Chennai";
		s.display();
		c.display();
		//StaticClass.info();
	    
	}

}
