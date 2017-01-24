package CollectionsDemo;

import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Stack {
	
	public static void main(String[] args) {
		
		java.util.Stack<String> colors = new java.util.Stack<>();
		colors.push("red");
		colors.add("blue");
		colors.add("pink");
		System.out.println("________Stack________");
		for(String s : colors)
			System.out.println(s);
		System.out.println(colors.peek());
		System.out.println(colors.pop());
		System.out.println(colors.peek());
		
		System.out.println("__________ priority Queue_______");
		Queue<Employee> emp = new PriorityQueue<>(new EmployeeCity());
		emp.add(new Employee("sri","wgl"));
		emp.offer(new Employee("vish","hyd"));
		for(Employee e : emp)
			System.out.println(e);
		emp.poll();
		for(Employee e1 : emp)
		System.out.printf("%s %n%s","after poll",e1);
		
		
		System.out.printf("%n %s %n","________queue using linked list_______");
		Queue<Employee> emp1 = new java.util.LinkedList<>();
		emp1.add(new Employee("sri","wgl"));
		emp1.offer(new Employee("vish","hyd"));
		for(Employee e : emp1)
			System.out.println(e);
		
		System.out.println("________Dqueue using linked list_______");
		Deque<Employee> emp2 = new java.util.LinkedList<>();
		emp2.add(new Employee("sri","wgl"));
		emp2.offer(new Employee("vish","hyd"));
		for(Employee e : emp2)
			System.out.println(e);
		
		
	}

	
}
