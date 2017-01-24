//session -8

package CollectionsDemo;

import java.util.Collections;
import java.util.List;

public class LinkedList {
	
	public static void main(String[] args) {
		
		List<Customer> customers = new java.util.LinkedList<>();
		Customer c1 = new Customer("srilu", "1234", "wgl");
		Customer c2 = new Customer("vishal", "2345", "Hyd");
		Customer c3 = new Customer("abc", "235", "Hyd1");
		Customer c4 = new Customer("xyz", "25", "Hyd2");
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);
		
		System.out.println("size is :" + customers.size());
		System.out.println("with for each loop");
		for(Customer c : customers)
		
			System.out.println(c);
		System.out.println("Searching: ");
		customers.contains(c1);
		customers.contains(c2);
		System.out.println("Sorting: ");
		Collections.sort(customers);
		System.out.println("after Sorting");
		for(Customer c : customers)
		
			System.out.println(c);

		//Collections.unmodifiableList(customers);
		
			customers.remove(0);
		
		System.out.println(Collections.frequency(customers, c1));
		
		// Vector list
		List<Customer> customersVector = new java.util.Vector<>();
		Customer c5 = new Customer("srilu", "1234", "wgl");
		Customer c6 = new Customer("vishal", "2345", "Hyd");
		Customer c7 = new Customer("abc", "235", "Hyd1");
		Customer c8 = new Customer("xyz", "25", "Hyd2");
		customersVector.add(c5);
		customersVector.add(c6);
		customersVector.add(c7);
		customersVector.add(c8);
		
	}

}
