package com.inheritance;

public class Soccer extends Game {
public int i =9;
	public void play(String ball) {
		System.out.println("Playing Soccer with "+ball);
		}
	public  int testInt(){
		return 5;
	}
	public static void main(String[] args) {
		Soccer s =new Soccer();
		Game g = new Soccer();
//		Game g1 = new Game();
//		System.out.println(g1.testInt());
		
	}
	@Override
	public void getAbstract() {
		// TODO Auto-generated method stub
		
	}
}
