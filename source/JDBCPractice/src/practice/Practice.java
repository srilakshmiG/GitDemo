package practice;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.domain.Address;
import practice.Employee;

public class Practice {
	
	public static Connection getConnection() throws SQLException {
		Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/srilu?autoReconnect=true&useSSL=false", "root", "admin");
		return con;
	}

	public static List<practice.Employee> getEmployeeData() {
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
				emp.setDateOfJoining(rs.getDate("dateofjoining"));
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
	
	public static void insertEmployee(practice.Employee emp) {

		try (Connection con = getConnection();) {
			String query = "INSERT INTO employee(name,dateofjoining,gender) VALUES (?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, emp.getName());
			pstmt.setDate(2, emp.getDateOfJoining());
			pstmt.setString(3, emp.getGender());
			int noOfRows = pstmt.executeUpdate();
			if (noOfRows != 0)
				System.out.println("Employee Record inserted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		
//		List<Employee> employees = getEmployeeData();
//		for(Employee e: employees)
//			System.out.println(e);
		
		@SuppressWarnings("deprecation")
		java.util.Date myDate = new java.util.Date("10/10/2009");
		java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());
		
		Employee emp1 = new Employee("John", sqlDate, "male");
		Employee emp2 = new Employee("John", sqlDate, "male");
		System.out.println("-----------Equals method with Employee id-----------");
		System.out.println(emp1.equals(emp2));
	}


}
