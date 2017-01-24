package com.patientSort;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.personDemographic.Patient.Gender;

public class Main {
	
	public static void main(String[] args) throws ParseException
	{
		
		DateFormat df = new SimpleDateFormat("yyyy/mm/dd");
		List<Patient> patients = new LinkedList<>();
		Patient p1 = new Patient();
		
		p1.setName("Joe");
		p1.setLastSeen(new Date());
		String date1 = "1990/08/12";
		p1.setDOB(df.parse(date1));
		
		Patient p2 = new Patient();
		p2.setName("Anna");
		p2.setLastSeen(new Date());
		String date2 = "1980/07/20";
		p2.setDOB(df.parse(date2));
		
		Patient p3 = new Patient();
		p3.setName("Bob");
		p3.setLastSeen(new Date());
		String date3 = "1980/07/20";
		p3.setDOB(df.parse(date3));
	
		patients.add(p1);
		patients.add(p2);
		patients.add(p3);
		
		System.out.println("check patient");
		System.out.println(patients.contains(p1));
		System.out.println("sorting based on name:");
		Collections.sort(patients);
		for(Patient p : patients)
		{
			System.out.println(p);
		}
		System.out.println("searching recent records:");
		System.out.println(patients.get(patients.size()-1));
		System.out.println(patients.get(patients.size()-2));
		System.out.println(patients.get(patients.size()-3));
		
	}

	

}
