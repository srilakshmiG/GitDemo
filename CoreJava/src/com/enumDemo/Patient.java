package com.enumDemo;

import java.util.Date;

public class Patient {
	
	private String name;
	private int age;
	private Gender gender;
	private String address;
	private Date dateOfjoining;
	
//	public Patient(String name, int age, Gender gender, String address, Date dateOfJoining)
//	{
//		this.name =name;
//		this.age = age;
//		this.gender = gender;
//		this.address = address;
//		this.dateOfjoining = dateOfJoining;
//	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateOfjoining() {
		return dateOfjoining;
	}

	public void setDateOfjoining(Date dateOfjoining) {
		this.dateOfjoining = dateOfjoining;
	}
	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address
				+ ", dateOfjoining=" + dateOfjoining + "]";
	}
	
	

}
