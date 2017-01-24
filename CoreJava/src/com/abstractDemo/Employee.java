package com.abstractDemo;

public abstract class  Employee {
	
	private String name;
	public int age;
	
	
	public Employee(String name, int age)
	{
		this.name= name;
		this.age = age;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public void getDetails()
	{
		System.out.println("in employee" + getName() +getAge());
	}
	
	public  abstract void getCompute();
	
}
