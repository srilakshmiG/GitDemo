package com.exam;

import java.util.ArrayList;
import java.util.List;

public class _C {
	public static void main(String[] args) {
		/*List<String> bunnies = new ArrayList<>();
		
		 bunnies.add("long ear");
		 bunnies.add("floppy");
		 bunnies.add("hoppy");
		System.out.println(bunnies); // [long ear, floppy, hoppy]
		bunnies.forEach(a -> System.out.println(a));
		// (a -> System.out.println(a));
		 bunnies.removeIf(s -> s.charAt(0) != 'h');
		System.out.println(bunnies); // [hoppy]
*/		StringBuilder s1 = new StringBuilder("s1");
		StringBuilder s2 = new StringBuilder("s2");
		StringBuilder s3 = work(s1, s2);
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
	}
	
	public static StringBuilder work(StringBuilder a,
			StringBuilder b) {
			a = new StringBuilder("a");
			b.append("b");
			return a;
			}
			
	
	
	
}
