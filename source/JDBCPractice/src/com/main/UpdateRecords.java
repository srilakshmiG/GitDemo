package com.main;

import com.dao.ManyToMany;
import com.dao.OneToMany;
import com.dao.OneToOneDao;

public class UpdateRecords {

	public static void main(String[] args) {

		OneToOneDao.updateEmployee();
		OneToOneDao.updateAddress(11, "update");

		OneToMany.updateCustomer("sri", 1);
		OneToMany.updateOrder(1, "mobilePhone");

		ManyToMany.updatePatient("Amy", 2);
		ManyToMany.updateDoctor("JasonJames", 3);
	}

}
