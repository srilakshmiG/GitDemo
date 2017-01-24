package com.serialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class main {
public static void main(String[] args) throws Exception {
	Student s1 = new Student("Joe", 1);
	FileOutputStream f = new FileOutputStream("abc.txt");
	ObjectOutputStream out = new ObjectOutputStream(f);
	out.writeObject(s1);
	out.flush();
	out.close();
	f.close();
	}
	

}
