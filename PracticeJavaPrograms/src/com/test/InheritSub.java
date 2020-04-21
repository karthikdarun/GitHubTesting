package com.test;

public class InheritSub extends InheritSuper{
	
	public InheritSub(String name) {
		super(name);
	}
	
public void move()
{
	super.move();
	System.out.println("Dog can move");
	}
public void eat()
{
	this.move();
	System.out.println("Dogs can eat");
	super.eat();
}

public void run()
{
	System.out.println("Dogs can run");
}
}
