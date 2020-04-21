package com.test;

import java.util.Collections;
import java.util.TreeSet;

public class SetDemo {

	public static void main (String args[])
	{
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(10);
		tree.add(50);
		tree.add(70);
		tree.add(30);
		tree.add(25);
		tree.add(20);
		tree.add(25);
		
		tree.add(5);
		System.out.println(tree.first());
		System.out.println(tree.last());
		
		
		
		
		
		for(Integer values:tree)
		{
			System.out.println(values);
		}
		
		
	}
}
