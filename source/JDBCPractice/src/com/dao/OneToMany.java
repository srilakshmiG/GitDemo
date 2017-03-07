package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.domain.Customer;
import com.domain.Order;

public class OneToMany {

	public static Connection getConnection() throws SQLException {
		Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/srilu?autoReconnect=true&useSSL=false", "root", "admin");
		return con;
	}

	public static List<Customer> getCustomerData() {
		List<Customer> customers = new ArrayList<>();
		try (Connection con = getConnection();) {
			String query = "SELECT * FROM customers c INNER JOIN orders o ON c.custid = o.custid";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			Customer cust = null;
			while (rs.next()) {
				if (cust == null || cust.getCustId() != rs.getInt("custId")) {
					cust = new Customer();
					setCustomer(rs, customers, cust);
				}
				cust.getOrders().add(new Order(rs.getInt("orderid"), rs.getString("itemname"), rs.getInt("custid")));
			}
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customers;

	}

	private static void setCustomer(ResultSet rs, List<Customer> customers, Customer cust) throws SQLException {
		List<Order> orders = new ArrayList<>();
		cust.setOrders(orders);
		cust.setCustId(rs.getInt("custid"));
		cust.setFirstName(rs.getString("firstname"));
		cust.setLastName(rs.getString("lastname"));
		cust.setGender(rs.getString("gender"));
		customers.add(cust);
	}

	public static void insertCustomer(Customer cust) {

		try (Connection con = getConnection();) {
			String query = "INSERT INTO customers(firstname,lastname,gender) VALUES (?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, cust.getFirstName());
			pstmt.setString(2, cust.getLastName());
			pstmt.setString(3, cust.getGender());
			int noOfRows = pstmt.executeUpdate();
			if (noOfRows != 0)
				System.out.println("Customer Record inserted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void insertOrder(int custId, Order o) {

		try (Connection con = getConnection();) {
			String query = "INSERT INTO orders(itemname,custid) VALUES (?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, o.getItemName());
			pstmt.setInt(2, custId);
			int noOfRows = pstmt.executeUpdate();
			if (noOfRows != 0)
				System.out.println("Order Record inserted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void updateCustomer(String name, int custId) {

		try (Connection con = getConnection();) {
			String query = "UPDATE customers SET firstname=? WHERE custid=?;";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setInt(2, custId);
			int noOfRows = pstmt.executeUpdate();
			if (noOfRows != 0)
				System.out.println("Customer Record Updated successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void updateOrder(int orderId, String itemName) {

		try (Connection con = getConnection();) {
			String query = "UPDATE orders SET itemname=? WHERE orderid=?;";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, itemName);
			pstmt.setInt(2, orderId);
			int noOfRows = pstmt.executeUpdate();
			if (noOfRows != 0)
				System.out.println("Order Record Updated successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void deleteCustomerAndOrder(int custId) {

		try (Connection con = getConnection();) {
			String orderDelete = "DELETE FROM orders  WHERE custid=?";
			PreparedStatement pstmt1 = con.prepareStatement(orderDelete);
			pstmt1.setInt(1, custId);
			pstmt1.executeUpdate();
			String query = "DELETE FROM customers  WHERE custid=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, custId);
			int noOfRows = pstmt.executeUpdate();
			if (noOfRows != 0)
				System.out.println("Customer Record Deleted successfully with respective orders");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
