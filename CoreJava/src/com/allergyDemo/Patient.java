package com.allergyDemo;

import java.util.ArrayList;
import java.util.List;

public class Patient {
	
	String name;
	List<Allergy> allergies = new ArrayList<>();
	
	public List<Allergy> getAllergies()
	{
		return allergies;
	}
	
	public void setAllergies(Allergy allergy)
	{
		allergies.add(allergy);
	}
	
	

}
