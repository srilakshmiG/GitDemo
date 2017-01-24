package com.inheritance;

public class Main {
	int i;
	public static void main(String[] args) throws Exception {
		
		Game g = new Soccer();
		g.play();
		
		Soccer s = (Soccer) g;
		s.play();
		s.play("ball");
//		Game g1 = new Soccer();
//		Soccer s1 = (Soccer)g1;
		
		
//		System.out.println('b'+10);
//		//String  a = "hi";
//	//Game g1 = new Game();
//	Soccer s1 = (Soccer)g1;
//	s1.i=8;
//	System.out.println(s1.i);
//	//g1.i=8;

	}

}
