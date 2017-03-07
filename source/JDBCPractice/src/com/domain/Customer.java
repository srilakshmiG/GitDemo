package com.domain;

import java.util.List;

public class Customer {

	private int custId;
	private String firstName;
	private String LastName;
	private String gender;
	private List<Order> orders;

	public Customer() {

	}

	public Customer(String firstName, String lastName, String gender) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		this.gender = gender;

	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", firstName=" + firstName + ", LastName=" + LastName + ", gender="
				+ gender + ", orders=" + orders + "]";
	}

}
