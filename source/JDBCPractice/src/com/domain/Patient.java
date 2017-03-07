package com.domain;

import java.util.List;

public class Patient {

	private int patientId;
	private String name;
	private String gender;
	private String symptoms;
	private List<Doctor> doctors;

	public Patient(int patientId, String name, String gender, String symptoms, List<Doctor> doctors) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.gender = gender;
		this.symptoms = symptoms;
		this.doctors = doctors;
	}

	public Patient(int patientId, String name, String gender, String symptoms) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.gender = gender;
		this.symptoms = symptoms;
	}

	public Patient() {

	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", name=" + name + ", gender=" + gender + ", symptoms=" + symptoms
				+ ", doctors=" + doctors + "]";
	}

}
