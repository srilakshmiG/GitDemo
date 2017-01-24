package CollectionsDemo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Map {
	
	public static void main(String[] args) {
		
		java.util.Map <String, String> colors = new HashMap<>();
		colors.put("red", "r");
		colors.put("blue", "b");
		colors.put("green", "g");
		colors.put("pink", "p");
		colors.put("pink", "p");
		
		colors.isEmpty();
		for(Entry<String, String>  entry : colors.entrySet())
		{
			//colors.put("orange", "O");// throws cme(concurrent hashmap exception)
			// if we use ConcurrentHashMap ,it is fail safe iteration
			System.out.print(entry.getKey()+"--");
			System.out.println(entry.getValue());
		}
		
		java.util.Map<Employee, Boolean> emps = new HashMap<>();
		Employee e1 = new Employee("sri","wgl");
		Employee e2 = new Employee("vish","hyd");
		Employee e3 = new Employee("sri","hyd");
		Employee e4 = new Employee("abc","ss");
		emps.put(e1, true);
		emps.put(e2, true);
		emps.put(e3, false);
		emps.put(e4, true);
		
		System.out.println("______ map");
		for(Entry<Employee,Boolean> emp : emps.entrySet())
		{
			System.out.print(emp.getKey()+"--");
			System.out.println(emp.getValue());
		}
		System.out.println("______ tree________");
		java.util.Map<Employee, Boolean> empTree = new TreeMap<>();
		Employee e5 = new Employee("sri","wgl");
		Employee e6 = new Employee("vish","hyd");
		Employee e7 = new Employee("sri","hyd");
		Employee e8 = new Employee("abc","ss");
		empTree.put(e5, true);
		empTree.put(e6, true);
		empTree.put(e7, false);
		empTree.put(e8, true);
		for(Entry<Employee, Boolean> emp : empTree.entrySet())
		{
			System.out.print(emp.getKey()+"--");
			System.out.println(emp.getValue());
		}
		
		System.out.println("______ HashTable________");
		java.util.Map<Employee, Boolean> empTable = new Hashtable<>();
		Employee e50 = new Employee("sri","wgl");
		Employee e60 = new Employee("vish","hyd");
		Employee e70 = new Employee("sri","hyd");
		Employee e80 = new Employee("abc","ss");
		empTable.put(e50, true);
		//empTable.put(e50, null);- value/key cant't be null in hashtable, it can be in hasgmap
		empTable.put(e60, true);
		empTable.put(e70, false);
		empTable.put(e80, true);
		for(Entry<Employee, Boolean> emp : empTable.entrySet())
		{
			System.out.print(emp.getKey()+"--");
			System.out.println(emp.getValue());
		}
		
		java.util.Map<Student,Boolean> studentsMap=new HashMap<>();
		
		Student student1=new Student(1,"sri","wgl");
		studentsMap.put(student1,true);
		
		Student student2=new Student(2,"vish","hnk");
		studentsMap.put(student2,false);
		
		System.out.println("______ sreya---------------");
		for(Entry<Student,Boolean> entry: studentsMap.entrySet())
		{
			System.out.print(entry.getKey()+"--");
			System.out.println(entry.getValue());
		}
		
	}
	
	
	
	
	

}
