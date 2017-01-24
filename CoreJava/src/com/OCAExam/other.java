package com.OCAExam;

public class other  {
	double side =0;
	double area;
	static int[] i={1,2};
	static double f;
	
	
	
	public other(double length) {
		super();
		this.side = length;
	}
	public double getSide(){
		return side;
	}
	


	public void setSide(double side) {
		this.side = side;
	}
	double getArea(){
		return area;
	}
	public static void main(String[] args) {
//		double x = 0xb10_000;
//		float x1= 0b10_000;
//		
//		float x2 = 0b20_000;
//		float x3 = 0b10_000f;
//		long x4 = 0b10000L;
//		double x5 = 0b10_000D;
		
//		other o = new other(10.0);
//		o.area = o.getSide()*o.getSide();
//		System.out.println(o.getArea());
//		System.out.println(i.length);
//		//System.out.println(x5);
//		System.out.println(o.check(null));
		
	}
	public static void work() throws Exception{
		System.out.println(f);;
	}
	

	/*int [][] a = new int[][] {{1,2},{3,8}};
	//int [][][] a1 =  {{1,2},{3,8},{0,9}};
//	int [][] a2 = new int[][] {0,1};
	
	int[] a3 ={0,1};
	int[][] a4 = {a3,{1,2},a3};
	int[][][] a5={a4};*/
	
	public String check(String s){
		if(s.length()==0 || s== null){
		return "empty";
		}
		else return "not";
	}
	
	

}
