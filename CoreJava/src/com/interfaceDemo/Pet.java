package com.interfaceDemo;

public class Pet  {
	
	private String name;
	int age;
	
	public Pet(String name, int age)
	{
		this.name= name;
		this.age = age;
	}
	
	public void eat()
	{
		System.out.println("pets eat");
	}

}
