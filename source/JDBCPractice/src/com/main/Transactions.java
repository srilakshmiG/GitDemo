package com.main;

import com.dao.SavepointDemo;
import com.domain.Address;
import com.domain.Employee;

public class Transactions {

	public static void main(String[] args) {
		SavepointDemo.insertEmployeeAddress(new Employee("Tommy", "2013-09-12", "male"), 26,
				new Address("lancaster", "MountJoy", "USA", "12345"));
	}

}
