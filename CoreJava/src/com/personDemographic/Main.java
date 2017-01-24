package com.personDemographic;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.personDemographic.Patient.Gender;

public class Main {
	
	public static void main(String[] args) 
	{
		
		List<Patient> persons = new LinkedList<>();
		Patient p1 = new Patient();
		
		p1.setName("Joe");
		p1.setGender(Gender.FEMALE);
		p1.setDateOfJoining(new Date());
		p1.setPhoneNumber("9876543210");
		
		Patient p2 = new Patient();
		p2.setName("Anna");
		p2.setGender(Gender.MALE);
		p2.setDateOfJoining(new Date());
		p2.setPhoneNumber("1234567889");
	
		persons.add(p1);
		persons.add(p2);
		
		
		for(Patient p : persons)
		{
			System.out.println(p);
		}
		System.out.println("searching by index:");
		System.out.println(persons.get(0));
		
	}

	

}
