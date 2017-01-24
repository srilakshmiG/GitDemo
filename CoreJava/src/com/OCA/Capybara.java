package com.OCA;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Capybara extends Rodent {
	//@Override
	public void test(String k) {
		
	}

	public static void main(String[] args) {
		//Rodent rodent = new Rodent();
		//Capybara capybara = (Capybara)rodent; // Throws ClassCastException at runtime
		
	}

	@Override
	public void test(int i)  {
		// TODO Auto-generated method stub
		
	}
	
	public Exception test1() throws IOException{
		Exception e =  new Exception();
		throw new FileNotFoundException();
		//return e;
		
	}
	public void test2(){
		try{
			
		}
		catch(NullPointerException e){
			
		}
	}
	public int num(){
		return 9;
		//int k =0;
		//return 8;
	}
}
