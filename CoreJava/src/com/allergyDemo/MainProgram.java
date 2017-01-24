package com.allergyDemo;

import com.allergyDemo.Allergy.Level;

public class MainProgram {
	
	public static void main(String[] args)
	{
		Patient p = new Patient();
		Allergy a = new Allergy();
		a.name ="cold";
		a.severity = Level.LOW;
		p.name = "Anna";
		p.setAllergies(a);
		
		Allergy a1 = new Allergy();
		a1.name = "skin";
		a1.severity = Level.HIGH;
		p.setAllergies(a1);
		p.getAllergies();
		System.out.println(p.name);
		System.out.println(a.name +" "+ a.severity);
		System.out.println(a1.name +" "+ a1.severity);
		
	}

}
