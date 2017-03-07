package com.main;

import java.util.List;

import com.dao.ManyToMany;
import com.dao.OneToMany;
import com.dao.OneToOneDao;
import com.domain.Customer;
import com.domain.Employee;
import com.domain.Patient;

public class RetreiveRecords {

	public static void main(String[] args) {
		System.out.println("-----------Employee Records-----------");
		List<Employee> emps = OneToOneDao.getEmployeeData();
		for (Employee e : emps)
			System.out.println(e);

		Employee emp1 = new Employee("John", "2017-08-09", "male");
		Employee emp2 = new Employee("John", "2016-08-09", "male");
		System.out.println("-----------Equals method with Employee id-----------");
		System.out.println(emp1.equals(emp2));

		System.out.println();
		System.out.println("-----------Customer and accociated Orders-----------");
		List<Customer> customers = OneToMany.getCustomerData();
		for (Customer c : customers)
			System.out.println(c);
		System.out.println();
		System.out.println("-----------Doctors accociated with Patients-----------");
		List<Patient> patients = ManyToMany.getPatientData();
		for (Patient p : patients)
			System.out.println(p);
	}

}
