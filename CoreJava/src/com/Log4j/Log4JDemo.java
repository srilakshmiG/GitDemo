package com.Log4j;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
public class Log4JDemo {
	static Logger log = Logger.getLogger("MyLogger");
	
	public static void main(String[] args)
	{
		BasicConfigurator.configure();
		log.debug("here is debuggin message");
		log.info("here is info msessage");
		MyMethod();
		
	}
	public static void MyMethod(){
		try{
			throw new Exception("My exception");
		}
		catch(Exception e){
			log.error("error occured",e);
		}
	}

}
