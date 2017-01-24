package com.OCAExam;

import java.util.Stack;

public class TestClass1 {
	static String str;
	/*public static void main(String[] args) throws Exception{
		doStuff();
		System.out.println("over");
	}
	
	public static void doStuff() throws Exception{
		System.out.println("doing stuff");
		double i =0;
		if(i == 0.01){
		throw new Exception();
		}
		System.out.println("done stuff");
	}*/
	public int h =4;
	public int getM(float f){
		System.out.println("test1"+"    " + h);
		return h;
	}
	
	public static void main(String[] args) {
		
//		TestClass t = new TestClass();
//		int i =1, j=10;
//		do{
//			if(i++ > j--) continue;
//		}while(i<5);
//		System.out.println(i+"  "+j);
//		short s =10;
//		char c = s;
//		s=c;
//		int i;
//		i =c;
//		i++;
		//c= i;
		
		
//		Stack s1 = new Stack();
//		Stack s2 = new Stack();
//		processStack(s1,s2);
//		System.out.println(s1 +"  "+s2);
		
//		Integer i = Integer.parseInt(args[0]);
//		Integer j =i;
//		i--;
//		i++;
//		System.out.println(i==j);
		
//		String s ="hello";
//		s.reverse();
//		String s1 ="one";
//		String s2 ="two";
//		//s1 = s2;
//		System.out.println(s1.equals(s1=s2));
		
		
		
//		A a = new C();
//		B b = (B)a;
//		System.out.println(a.m1());
//		System.out.println(b.i);
//		
		System.out.println(str);
	}
	
		private static void processStack(Stack s1, Stack s2) {
		// TODO Auto-generated method stub
		s1.push(new Integer("100"));
		s2 =s1;
	}
	
	}
class A{
	int i =10;
	int m1(){
		return i;
	}
}
class B extends A{
	int i =20;
	int m1(){
		return i;
	}
}
class C extends B{
	int i =30;
	int m1(){
		return i;
	}
}

