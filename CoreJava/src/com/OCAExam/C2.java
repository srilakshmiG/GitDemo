package com.OCAExam;

public class C2 extends Super {
	
	public int getNum(int i,char c){
		return 4;
	}
	static int a =0;
	int b=5;
	public void foo(){
		while(b>0){
			b--;
			a++;
		}
	}
	
	
	
	public static void main(String[] args) {
		//System.out.println(new C2().getNum(4));
		C2 c = new C2();
		c.foo();
		C2 c1 = new C2();
		c1.foo();
		System.out.println(c.a+""+c1.a);
	}


}
