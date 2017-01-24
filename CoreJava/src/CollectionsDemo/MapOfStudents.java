package CollectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class MapOfStudents {

	public static void main(String[] args) {
		java.util.Map<Student,Integer> studentsMap=new HashMap<>();
	
	Student student1=new Student(1,"sri","wgl");
	studentsMap.put(student1,1);
	
	Student student2=new Student(2,"vish","hnk");
	studentsMap.put(student2,2);
	
	
	for(Entry<Student,Integer> entry: studentsMap.entrySet())
	{
		System.out.print(entry.getKey()+"--");
		System.out.println(entry.getValue());
	}
	
//	Iterator<Entry<Student, Integer>> it = studentsMap.entrySet().iterator();
//    while (it.hasNext()) {
//    	Entry<Student,Integer> pair = (Entry<Student, Integer>)it.next();
//        System.out.println(pair.getKey() + " = " + pair.getValue());
//        it.remove(); // avoids a ConcurrentModificationException
//    }
	

	
	}

}