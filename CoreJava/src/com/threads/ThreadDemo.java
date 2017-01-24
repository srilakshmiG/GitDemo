package com.threads;

public class ThreadDemo extends Thread {
	
	Printing p;  
	ThreadDemo(Printing p){  
	this.p=p;  
	}  
	public void run(){  
	p.printTable(1);  
	}  
	  
	}  
	
	


