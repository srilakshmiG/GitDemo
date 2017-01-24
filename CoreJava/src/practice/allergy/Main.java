package practice.allergy;

import java.util.ArrayList;
import java.util.List;

import practice.allergy.Allergy.Level;

public class Main {
	
	public static void main(String[] args)
	{
		List<String> symptoms = new ArrayList<>();
		symptoms.add("headache");
		symptoms.add("sneezing");
		Patient p = new Patient();
		
		Allergy a1 = new Allergy();
		a1.level = Level.LOW;
		a1.name = "cold";
		a1.reportedBy = "doctor";
		a1.symptoms = symptoms;
		
		Allergy a2 = new Allergy();
		a2.level = Level.MEDIUM;
		a2.name = "skin";
		a2.reportedBy = "clinician";
		a2.symptoms = symptoms;
		
		p.setAllergies(a1);
		p.setAllergies(a2);
		p.name = "John";
		
		System.out.println(p.name);
		p.getAllergies();
		
		System.out.printf("%s %n%s %n%s %n%s %n%s%n","allergy 1 details:",a1.name, a1.level, a1.reportedBy,a1.symptoms);
		System.out.printf("%s %n%s %n%s %n%s","allergy 2 details:",a2.name, a2.level, a2.reportedBy);
		
		
	}

}
