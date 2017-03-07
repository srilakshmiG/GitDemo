package com.domain;

import java.util.List;

public class Doctor {

	private int doctorId;
	private String name;
	private String department;
	private List<Patient> patients;

	public Doctor(int doctorId, String name, String department) {
		super();
		this.doctorId = doctorId;
		this.name = name;
		this.department = department;
	}

	public Doctor(int doctorId, String name, String department, List<Patient> patients) {
		super();
		this.doctorId = doctorId;
		this.name = name;
		this.department = department;
		this.patients = patients;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", name=" + name + ", department=" + department + "]";
	}

}
