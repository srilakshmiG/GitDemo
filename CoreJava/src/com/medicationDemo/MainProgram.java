package com.medicationDemo;

import java.util.Date;

import com.medicationDemo.Medication.Dosage;
import com.medicationDemo.Medication.Period;

public class MainProgram {
	
	public static void main(String[] args) {
		
		Patient p = new Patient();
		Medication m = new Medication();
		m.name = "paracetamol";
		m.startDate = new Date();
		m.frequency = Dosage.DAILY_ONCE;
		m.stop = Period.TWO_DAYS;
		p.name = "John";
		p.setMedication(m);
		
		Medication m1 = new Medication();
		m1.name = "Antibiotic";
		m1.startDate= new Date();
		m1.frequency = Dosage.DAY_NIGHT;
		m1.stop= Period.ONE_WEEK;
		p.setMedication(m1);
		
		System.out.println(p.name);
		System.out.println(m);
		System.out.println(m1);
	}

}
