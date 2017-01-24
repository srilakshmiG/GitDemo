package practice.allergy;

import java.util.ArrayList;
import java.util.List;

public class Patient {
	
	 String name;
     List<Allergy> allergies = new ArrayList<>();
    
    public void setAllergies(Allergy allergy)
    {
    	allergies.add(allergy);
    }
    
    public List getAllergies()
    {
    	return allergies;
    }

	 
    
   

}
