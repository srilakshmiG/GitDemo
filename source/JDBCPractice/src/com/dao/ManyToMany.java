/*
sri
*/

package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.domain.Doctor;
import com.domain.Patient;

public class ManyToMany {

	public static Connection getConnection() throws SQLException {
		Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/srilu?autoReconnect=true&useSSL=false", "root", "admin");
		return con;
	}

	public static List<Patient> getPatientData() {
		List<Patient> patients = new ArrayList<>();
		try (Connection con = getConnection();) {
			String query = "SELECT * FROM patientdoctor JOIN patient ON patient.patientid = patientdoctor.patientid JOIN doctor ON doctor.doctorid = patientdoctor.doctorid";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			Patient p = null;
			while (rs.next()) {
				if (p == null || p.getPatientId() != rs.getInt("patientid")) {
					p = new Patient();
					setPatient(p, patients, rs);
				}
				p.getDoctors().add(new Doctor(rs.getInt("doctorid"), rs.getString("doctorname"),
						rs.getString("department"), patients));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return patients;
	}

	public static void setPatient(Patient p, List<Patient> patients, ResultSet rs) {
		List<Doctor> doctors = new ArrayList<>();
		p.setDoctors(doctors);
		try (Connection con = getConnection();) {
			p.setPatientId(rs.getInt("patientid"));
			p.setName(rs.getString("patientname"));
			p.setGender(rs.getString("gender"));
			p.setSymptoms(rs.getString("symptoms"));
			patients.add(p);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void insertPatient(Patient p) {

		try (Connection con = getConnection();) {
			String query = "INSERT INTO patient(patientid,patientname,gender,symptoms) VALUES (?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, p.getPatientId());
			pstmt.setString(2, p.getName());
			pstmt.setString(3, p.getGender());
			pstmt.setString(4, p.getSymptoms());
			int noOfRows = pstmt.executeUpdate();
			if (noOfRows != 0)
				System.out.println("Patient Record inserted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void insertDoctor(Doctor d) {

		try (Connection con = getConnection();) {
			String query = "INSERT INTO doctor(doctorid,doctorname,department) VALUES (?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, d.getDoctorId());
			pstmt.setString(2, d.getName());
			pstmt.setString(3, d.getDepartment());
			int noOfRows = pstmt.executeUpdate();
			if (noOfRows != 0)
				System.out.println("Doctor Record inserted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void updatePatient(String name, int patientId) {

		try (Connection con = getConnection();) {
			String query = "UPDATE patient SET patientname=? WHERE patientid=?;";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setInt(2, patientId);
			int noOfRows = pstmt.executeUpdate();
			if (noOfRows != 0)
				System.out.println("Patient Record Updated successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void updateDoctor(String name, int doctorId) {

		try (Connection con = getConnection();) {
			String query = "UPDATE doctor SET doctorname=? WHERE doctorid=?;";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setInt(2, doctorId);
			int noOfRows = pstmt.executeUpdate();
			if (noOfRows != 0)
				System.out.println("Doctor Record Updated successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void deletePatient(int patientId) {

		try (Connection con = getConnection();) {
			String junctionDelete = "DELETE FROM patientdoctor  WHERE patientid=?";
			PreparedStatement pstmt1 = con.prepareStatement(junctionDelete);
			pstmt1.setInt(1, patientId);
			pstmt1.executeUpdate();
			String query = "DELETE FROM patient  WHERE patientid=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, patientId);
			int noOfRows = pstmt.executeUpdate();
			if (noOfRows != 0)
				System.out.println("Patient Record Deleted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void deleteDoctor(int doctorId) {

		try (Connection con = getConnection();) {
			String junctionDelete = "DELETE FROM patientdoctor  WHERE doctorid=?";
			PreparedStatement pstmt1 = con.prepareStatement(junctionDelete);
			pstmt1.setInt(1, doctorId);
			pstmt1.executeUpdate();
			String query = "DELETE FROM doctor  WHERE doctorid=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, doctorId);
			int noOfRows = pstmt.executeUpdate();
			if (noOfRows != 0)
				System.out.println("Doctor Record Deleted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
