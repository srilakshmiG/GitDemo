package com.abstractDemo;

public class Salary extends Employee {
	
	private double salary;
	
	public Salary(String name,int age,double salary)
	{
		super(name,age);
		this.salary = salary;
		
		
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void getDetails()
	{
		System.out.println("in salary");
		System.out.println("employee details" + getName() + age );
	}
	

	@Override
	public void getCompute() {
		
		System.out.println("employee details" + getSalary());
		
	}
	
	public static void main(String[] args)
	{
		Salary s = new Salary("sri",20, 2000.0);
		Employee e = new Salary("vish", 20, 3000.0);
		s.getDetails();
		e.getDetails();
		s.getCompute();
		
	}
	
	

}
