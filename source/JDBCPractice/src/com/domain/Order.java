package com.domain;

public class Order {

	private int orderId;
	private int custId;
	private String itemName;
	private Customer customer;

	public Order(int orderId, String itemName, int custId) {
		super();
		this.orderId = orderId;
		this.itemName = itemName;
		this.custId = custId;
	}

	public Order(String itemName) {
		this.itemName = itemName;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", custId=" + custId + ", itemName=" + itemName + "]";
	}

}
