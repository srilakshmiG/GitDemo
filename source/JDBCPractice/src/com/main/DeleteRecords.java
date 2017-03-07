package com.main;

import com.dao.ManyToMany;
import com.dao.OneToMany;
import com.dao.OneToOneDao;

public class DeleteRecords {

	public static void main(String[] args) {

		OneToOneDao.deleteEmployeeAndAddress(8);
		OneToMany.deleteCustomerAndOrder(2);
		ManyToMany.deletePatient(4);
		ManyToMany.deleteDoctor(4);
	}
}
