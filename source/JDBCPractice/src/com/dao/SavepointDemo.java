package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

import com.domain.Address;
import com.domain.Employee;

public class SavepointDemo {

	static Connection con = null;

	public static Connection getConnection() throws SQLException {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/srilu?autoReconnect=true&useSSL=false", "root",
				"admin");
		return con;
	}

	public static void insertEmployeeAddress(Employee emp, int id, Address add) {
		Savepoint savePoint = null;
		try {
			Connection con = getConnection();
			String query1 = "INSERT INTO employee(name,dateofjoining,gender) VALUES (?,?,?)";
			String query2 = "INSERT INTO address(street,city,state,country,zipcode,empid) VALUES (?,?,?,?,?,?)";
			con.setAutoCommit(false);
			PreparedStatement pstmt = con.prepareStatement(query1);
			pstmt.setString(1, emp.getName());
			pstmt.setString(2, emp.getDateOfJoining());
			pstmt.setString(3, emp.getGender());
			int noOfRows = pstmt.executeUpdate();
			savePoint = con.setSavepoint("Employee Record inserted successfully- savepoint");
			if (noOfRows != 0)
				System.out.println("Employee Record inserted successfully");

			PreparedStatement pstmt1 = con.prepareStatement(query2);
			pstmt1.setString(1, add.getStreet());
			pstmt1.setString(2, add.getCity());
			pstmt1.setString(3, add.getState());
			pstmt1.setString(4, add.getCountry());
			pstmt1.setString(5, add.getZipCode());
			pstmt1.setInt(6, id);
			noOfRows = pstmt1.executeUpdate();
			if (noOfRows != 0)
				System.out.println("Address Record inserted successfully");
			con.commit();
		}

		catch (SQLException e) {
			try {
				if (savePoint == null) {
					con.rollback();
					System.out.println("transaction rolled back successfully, failure occured in employee insertion");
				} else {
					con.rollback(savePoint);
					System.out.println("Rolled back to the save point and employee record inserted succusfully");
					con.commit();
				}
				con.close();
			} catch (SQLException e1) {
				e1.getMessage();
				e1.getErrorCode();
			}
			e.getMessage();
			e.getErrorCode();
		}

	}

}
