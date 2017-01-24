package com.personDemographic;
import java.util.Date;
public class Patient {
	
	private String name;
	private Date dateOfJoining;
	private Gender sex;
	private String phoneNumber;
	
	public enum Gender{
		MALE,FEMALE,OTHERS;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public Date getDateOfJoining()
	{
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining)
	{
		this.dateOfJoining = dateOfJoining;
	}
	
	public Gender getGender(){
		return sex;
	}
	
	public void setGender(Gender sex)
	{
		this.sex = sex;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	public String toString()
	{
		return "Person [ name: " + name + ", Gender: " + sex + ", Date of joining: " + dateOfJoining + ", Contact number: "+ phoneNumber + "]";      
	}
	
	

}
