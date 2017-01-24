package com.enumDemo;

import java.util.Date;

public class PatientMain {
	
	public static void main (String[] args){
		Patient p = new Patient();
		p.setName("sri");
		p.setAge(20);
		p.setAddress("dallas");
		p.setGender(Gender.MALE);
		p.setDateOfjoining(new Date());
		System.out.println(p);
		//System.out.printf("%s %n %s%s%n %s%s%n %s%s%n %s%s%n %s%s%n","Patient details:","Name:",p.getName(),"Age:",p.getAge(),"Gnder:",p.getGender(),"Address:",p.getAddress(),"Date of joining:",p.getDateOfjoining());
		
	}

}
