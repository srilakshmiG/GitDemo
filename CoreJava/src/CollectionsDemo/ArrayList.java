package CollectionsDemo;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



public class ArrayList{
	
	public static void main(String[] args) {
		
		List<Customer> customers = new java.util.ArrayList<>();
		Customer c1 = new Customer("a", "1234", "wgl");
		Customer c2 = new Customer("b", "2345", "Hyd");
		Customer c3 = new Customer("c", "235", "Hyd1");
		Customer c4 = new Customer("d", "25", "Hyd2");
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);
		System.out.println("size is" + customers.size());
		System.out.println("with for each loop");
		for(Customer c : customers)
		    
			System.out.println(c);
		System.out.println("_______with lamda________");
		customers.forEach(cust -> System.out.println(cust)); 
		
		System.out.println("with iterator");
		Iterator<Customer> i = customers.iterator();
		while(i.hasNext())
		{
			Customer cus = i.next();
			System.out.println(cus);
		}
		
		System.out.println("with iterator list in reverse order");
		Iterator<Customer> il = customers.listIterator(customers.size());
		while(((ListIterator<Customer>) il).hasPrevious())
		{
			Customer cus = ((ListIterator<Customer>) il).previous();
			System.out.println(cus);
		}
		
	}

}
