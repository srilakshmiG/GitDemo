package com.threads;

public class ThreadDemo2 extends Thread {
	
	Printing p;  
	ThreadDemo2(Printing p){  
	this.p=p;  
	}  
	public void run(){  
	p.printTable(10);  
	}  

}
