package com.threads;

public class Main {
	
	public static void main(String[] args){
		
		Printing obj = new Printing();//only one object  
		ThreadDemo t1=new ThreadDemo(obj);  
		ThreadDemo2 t2=new ThreadDemo2(obj);  
		t1.start();  
		t2.start();
	}

}
