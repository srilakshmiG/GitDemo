package CollectionsDemo;

import java.util.Arrays;
import java.util.List;

//session 9
public class AutoBoxing {
	
	int x =10;
	Integer i = x; // auto boxing
	int t = i;// auto unboxing
	
	String s = "sri";
	int i1 = Integer.parseInt(s);
	String s1 = i.toString();
	
	public static void main(String[] args) {
		
		List<Integer> numbers = new java.util.ArrayList<>();
		numbers.add(1);
		numbers.toArray();
		Integer[] numArray = new Integer[2];
		Arrays.asList(numArray);
		
	}
	
	
	
}
