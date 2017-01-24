package com.OCAExam;
import com.OCA.*;

public class TestClass {
	
	public static void main(String[] args) {
	//	System.out.println(com.OCAExam.Ocra);
		try {
			hello();
		} catch (MyException e) {
			System.out.println(e);
		}
		
	}
	
	static void hello() throws MyException{
		int[] i = new int[7];
		i[0]= 900;
		foo();
	}
	static void foo() throws MyException{
		throw new MyException("from foo");
	
	
		
	}

}
