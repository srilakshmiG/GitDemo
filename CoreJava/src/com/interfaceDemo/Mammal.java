package com.interfaceDemo;

public  interface Mammal {
  String name=null;
	public void breath();
	public  default boolean test(){
		return true;
	}
	static int r(){
		return 4;
	}
	abstract void abc();
	public  static  void eatGrass(){
		
	}

}
