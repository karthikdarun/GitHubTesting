package com.test;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String args[])
	{
		HashMap<Integer,String> hash = new HashMap<Integer,String>();
		hash.put(10,"Karthik");
		hash.put(30,"Raja");
		hash.put(50,"Santhosh");
		hash.put(25,"Ramu");
		hash.put(40,"Kane");
		hash.put(15,"Somu");
		
		System.out.println(hash.size());
		
		System.out.println(hash.get(10));
		System.out.println(hash.get(90));
		System.out.println(hash.containsKey(30));
		System.out.println(hash.containsValue("sangeeth"));
		hash.remove(15);
		
		for(Map.Entry<Integer,String> keyValues: hash.entrySet())
		{
			Integer key = keyValues.getKey();
			String value = keyValues.getValue();
			System.out.print("Key is: " + key  );
			System.out.println(" Value is: "+value);
		}
		
		
			
		}
	}


