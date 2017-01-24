package com.interfaceDemo;

public class Cat extends Pet implements Mammal {
	private String color;
	
	public Cat(String color,String name,int age)
	
	{
		super(name,age);
		this.color = color;
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("cats breath");
	}
	
	public void eat()
	{
		super.eat();// call super class()
		System.out.println("cats eat");
	}

	
	public static void main(String[] args) {
		
		Pet p = new Cat("while","abc",2);
		//((Cat) p).breath();
		p.eat();
		//p.name;s
		Mammal m = new Cat("while","abc",2);
		m.breath();
		
		System.out.println(Mammal.name);
		System.out.print(Mammal.r());
		
	}

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	}

}
