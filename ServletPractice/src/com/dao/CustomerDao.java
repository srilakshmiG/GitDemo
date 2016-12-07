package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.domian.Customer;



public class CustomerDao {
	
	public static Connection getConnection() throws SQLException
	{
		String url = "jdbc:mysql://localhost:3306/javatraining?useSSL=false";
		Connection con = DriverManager.getConnection(url,"root","admin");
		return con;
	}
	
	public int insertCustomer(Customer customer) throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =getConnection();
		String query = "insert into customer (name,street,city,state,country,zipCode) values(?,?,?,?,?,?)";
		java.sql.PreparedStatement pstm = con.prepareStatement(query);
		
		pstm.setString(1, customer.getName());
		pstm.setString(2, customer.getStreet());
		pstm.setString(3, customer.getCity());
		pstm.setString(4, customer.getState()); 
		pstm.setString(5, customer.getCountry());
		pstm.setString(6, customer.getZipCode());
		int noOfRowsEffected =pstm.executeUpdate();
		System.out.println("Inserted successfully and number of rows"+noOfRowsEffected);
		try{
			if(noOfRowsEffected !=0)
				System.out.println("Insertion successfull");
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		pstm.close();
		con.close();
		return noOfRowsEffected;
		
	}
	
	public List<Customer> getCustomerByCity(String city) throws SQLException,ClassNotFoundException
	{
		List<Customer> customers = new ArrayList<>();
		Class.forName("com.mysql.jdbc.Driver");
		
			Connection con = getConnection();
			String sql= "select * from customer where city=?";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, city);
			ResultSet rs =pstm.executeQuery();
			while(rs.next())
			{
				Customer c = new Customer();
				c.setId(rs.getInt("customerId"));
				c.setName(rs.getString("name"));
				c.setCity(rs.getString("city"));
				c.setState(rs.getString("state"));
				c.setCountry(rs.getString("country"));
				
				customers.add(c);
			}
			rs.close();
			pstm.close();
			con.close();
			return customers;
	}
	
	public List<Customer> getCustomerByState(String state) throws SQLException,ClassNotFoundException
	{
		List<Customer> customers = new ArrayList<>();
		Class.forName("com.mysql.jdbc.Driver");
		
			Connection con = getConnection();
			String sql= "select * from customer where state=?";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, state);
			ResultSet rs =pstm.executeQuery();
			while(rs.next())
			{
				Customer c = new Customer();
				c.setId(rs.getInt("customerId"));
				c.setName(rs.getString("name"));
				c.setCity(rs.getString("city"));
				c.setState(rs.getString("state"));
				c.setCountry(rs.getString("country"));
				
				customers.add(c);
			}
			rs.close();
			pstm.close();
			con.close();
			return customers;
	}
}
	


