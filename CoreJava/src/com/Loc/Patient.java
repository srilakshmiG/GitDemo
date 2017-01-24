package com.Loc;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


public class Patient {
	
	String name;
	String phoneNumber;
	gender sex;
	Date dat;
	
	public enum gender {
		male,
		female;
	}
	
	List<Location> locations = new ArrayList<Location>();
	
	public void addLocation(Location loc)
    {

        locations.add(loc);
    }
	
	  public List allLocations()
      {
          return locations;
      }

}
