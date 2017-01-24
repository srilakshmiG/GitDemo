package com.medicationDemo;

import java.util.ArrayList;
import java.util.List;

public class Patient {
	
	String name;
	List<Medication> medications = new ArrayList<>();
	
	public void setMedication(Medication medication)
	{
		medications.add(medication);
	}
	
	public List<Medication> getMedications()
	{
		return medications;
	}

}
