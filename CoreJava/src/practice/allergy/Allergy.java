package practice.allergy;
import java.util.List;
public class Allergy {
	
	String name;
	List<String> symptoms;
	String reportedBy;
	Level level;
	
	public enum Level{
		LOW,MEDIUM,HIGH;
	}
	
	

}
