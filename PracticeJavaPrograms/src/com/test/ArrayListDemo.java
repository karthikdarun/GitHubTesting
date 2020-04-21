package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListDemo {
	
	public static void main (String args[])
	{
		LinkedList<String> obj1 = new LinkedList<>();
		obj1.add("Karthik");
		obj1.add("raja");
		obj1.add("Senthil");
		obj1.add("Akhil");
		obj1.add("Anand");
		obj1.add("Mani");
		obj1.add("Dani");
		
		System.out.println(obj1.size());
		
		obj1.remove(3);
		
		obj1.addFirst("sanjay");
		obj1.addLast("ramasamy");
		
		System.out.println("7th index element is "+obj1.get(7));
		
		Collections.sort(obj1);
		
		
		Iterator<String> i = obj1.iterator();
		
		while(i.hasNext())
		{
			String elements = i.next();
			System.out.println(elements);
		}
	}

}
