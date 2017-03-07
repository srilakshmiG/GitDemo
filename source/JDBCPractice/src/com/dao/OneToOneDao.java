package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.domain.Address;
import com.domain.Employee;

public class OneToOneDao {

	public static Connection getConnection() throws SQLException {
		Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/srilu?autoReconnect=true&useSSL=false", "root", "admin");
		return con;
	}

	public static List<Employee> getEmployeeData() {
		List<Employee> employees = new ArrayList<>();
		try (Connection con = getConnection();) {
			String query = "SELECT * FROM employee e INNER JOIN address a ON e.empid = a.empid";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				Address a = new Address(rs.getString("street"), rs.getString("city"), rs.getString("state"),
						rs.getString("country"), rs.getString("zipcode"));
				Employee emp = new Employee();
				emp.setName(rs.getString("name"));
				emp.setDateOfJoining(rs.getString("dateofjoining"));
				emp.setGender(rs.getString("gender"));
				emp.setAddress(a);
				employees.add(emp);
			}
			return employees;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}

	public static void insertEmployee(Employee emp) {

		try (Connection con = getConnection();) {
			String query = "INSERT INTO employee(name,dateofjoining,gender) VALUES (?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, emp.getName());
			pstmt.setString(2, emp.getDateOfJoining());
			pstmt.setString(3, emp.getGender());
			int noOfRows = pstmt.executeUpdate();
			if (noOfRows != 0)
				System.out.println("Employee Record inserted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void insertAddress(int id, Address add) {

		try (Connection con = getConnection();) {
			String query = "INSERT INTO address(street,city,state,country,zipcode,empid) VALUES (?,?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, add.getStreet());
			pstmt.setString(2, add.getCity());
			pstmt.setString(3, add.getState());
			pstmt.setString(4, add.getCountry());
			pstmt.setString(5, add.getZipCode());
			pstmt.setInt(6, id);
			int noOfRows = pstmt.executeUpdate();
			if (noOfRows != 0)
				System.out.println("Address Record inserted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void updateEmployee() {

		try (Connection con = getConnection();) {
			String query = "UPDATE employee SET name=? WHERE empid=?;";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, "srilakshmi");
			pstmt.setInt(2, 7);
			int noOfRows = pstmt.executeUpdate();
			if (noOfRows != 0)
				System.out.println("Employee Record Updated successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void updateAddress(int empId, String street) {

		try (Connection con = getConnection();) {
			String query = "UPDATE address SET street=? WHERE empid=?;";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, street);
			pstmt.setInt(2, empId);
			int noOfRows = pstmt.executeUpdate();
			if (noOfRows != 0)
				System.out.println("Address Record Updated successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void deleteEmployeeAndAddress(int empId) {

		try (Connection con = getConnection();) {
			String addressDelete = "DELETE FROM address  WHERE empid=?";
			PreparedStatement pstmt1 = con.prepareStatement(addressDelete);
			pstmt1.setInt(1, empId);
			pstmt1.executeUpdate();
			String query = "DELETE FROM employee  WHERE empid=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, empId);
			int noOfRows = pstmt.executeUpdate();
			if (noOfRows != 0)
				System.out.println("Employee Record Deleted successfully with respective address");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
