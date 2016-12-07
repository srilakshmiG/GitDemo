package com.domian;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private int id;
	private String name;
	private String street;
	private String city;
	private String state;
	private String country;
	private String zipCode;
	PhoneInformation phoneInfo;
	private List<OrdersPlaced> orders = new ArrayList<>();
	
	
	
	public List<OrdersPlaced> getOrders() {
		return orders;
	}
	public void setOrders(List<OrdersPlaced> orders) {
		this.orders = orders;
	}
	public PhoneInformation getPhoneInfo() {
		return phoneInfo;
	}
	public void setPhoneInfo(PhoneInformation phoneInfo) {
		this.phoneInfo = phoneInfo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
	
}
