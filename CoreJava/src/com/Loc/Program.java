package com.Loc;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;



public class Program {

	public static void main(String[] args) {
		
		TimeZone zone = TimeZone.getTimeZone("CST");
		Date dt = new Date();
		
		Patient p = new Patient();
		
		p.name = "Aditya";
		p.sex = Patient.gender.male;
		p.dat = dt;
		
		p.phoneNumber = "2019120950";
       
		Location loc = new Location();
		
		loc.Street = "5 Jenny Lyn Ct";
		loc.City = "Pitts";
		loc.Country = "USA";
		loc.ZipCode = 15239;
		
        Location loc1 = new Location();
		
		loc1.Street = "5336 Harrison";
		loc1.City = "KC";
		loc1.Country = "USA";
		loc1.ZipCode = 64110;
		
		 p.addLocation(loc);
         p.addLocation(loc1);
         
         System.out.println(p.dat);
         
     String item;
     p.allLocations();
     System.out.println(loc1.Street);
     System.out.println(loc.Street);
		
	}

}
