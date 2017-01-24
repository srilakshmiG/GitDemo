package com.patientSort;
import java.util.Date;
public class Patient implements Comparable<Patient> {
	
	private String name;
	private Date DOB;
	private Date lastSeen;
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public Date getDOB()
	{
		return DOB;
	}
	public void setDOB(Date DOB)
	{
		this.DOB = DOB;
	}
	
	public Date getLastSeen() {
		return lastSeen;
	}
	public void setLastSeen(Date lastSeen) {
		this.lastSeen = lastSeen;
	}
	public String toString()
	{
		return "Person [ name= " + name + ", Date of Birth= " + DOB + ", Last seen= "+ lastSeen + "]";      
	}
	
	// for sorting
	public int compareTo(Patient p) {
		
		return this.name.compareTo(p.getName());

	}

}
