package com.main;

import com.dao.ManyToMany;
import com.dao.OneToMany;
import com.dao.OneToOneDao;
import com.domain.Address;
import com.domain.Customer;
import com.domain.Doctor;
import com.domain.Employee;
import com.domain.Order;
import com.domain.Patient;

public class InsertRecords {

	public static void main(String[] args) {

		OneToOneDao.insertAddress(8, new Address("tumbleStone", "MountJoy", "PA", "USA", "12345"));
		OneToOneDao.insertEmployee(new Employee("Tom", "2013-09-12", "male"));

		OneToMany.insertCustomer(new Customer("Curtis", "Cooper", "Male"));
		OneToMany.insertOrder(2, new Order("Pen"));

		ManyToMany.insertPatient(new Patient(3, "Jenniet", "Female", "bodypains"));
		ManyToMany.insertDoctor(new Doctor(4, "Adward", "General"));
	}

}
