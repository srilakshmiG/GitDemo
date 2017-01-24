package com.loggingDemo;

import java.util.logging.Logger;


public class LoggingSample {
	private static Logger myLogger = Logger.getLogger(LoggingSample.class.getName());
	private  String message;
	
	public LoggingSample(String message)
	{
		this.message = message;
	}
	
	public  void setMessage()
	{
		
		myLogger.info("Hello logging");
		System.out.println(message);
	}
	
	public static void main(String[] args){
		
		
		
		LoggingSample ls = new LoggingSample("Hello World");
		ls.setMessage();
		
	}

}
