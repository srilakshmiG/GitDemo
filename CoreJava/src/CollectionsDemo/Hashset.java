package CollectionsDemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hashset {
	
	public static void main(String[] args) {
		
		Set<Employee> employees = new HashSet<>();
		Employee e1 = new Employee("sri","wgl");
		Employee e2 = new Employee("vish","hyd");
		Employee e3 = new Employee("sri","hyd");
		Employee e4 = new Employee("abc","ss");
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		System.out.println("for hash set");
		for(Employee e : employees)
			System.out.println(e);
		System.out.println(employees.size());// prints 3 beacause we are overriding equals and hashcode
		
		// Tree set
		
		Set<Employee> emps = new TreeSet<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		System.out.println("for tree set");
		for(Employee e : emps)
			System.out.println(e);
		System.out.println(emps.size());
		
		System.out.println("name and city as sort critiria");
		
		Set<Employee> emp = new TreeSet<>(new EmployeeCity());
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		System.out.println("for tree set with name and city");
		for(Employee e : emp)
			System.out.println(e);
		System.out.println(emp.size());
		
		
		
		
	}

}
