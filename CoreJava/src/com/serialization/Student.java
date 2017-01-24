package com.serialization;

import java.io.Serializable;

public class Student implements Serializable {
	
	String name;
	int id;
	
	Student(String name,int id){
		this.name= name;
		this.id= id;
	}

}
