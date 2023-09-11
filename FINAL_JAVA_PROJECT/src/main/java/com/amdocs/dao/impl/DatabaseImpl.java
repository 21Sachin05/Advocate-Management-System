package com.amdocs.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import com.amdocs.dao.DatabaseDao;
import com.amdocs_entity.Customer;

import DBConnection.DBConnection;

public class DatabaseImpl implements DatabaseDao {
	
	//private static DBConnection dbConnection =new DBConnection();
	private static Connection connection=DBConnection.getConnection();
	
	
	@Override
	public boolean addToDB(Customer customer) {
		// TODO Auto-generated method stub
		try
		{
			String sql="INSERT INTO customer(firstname,lastname,phonenumber,pincode,remark) VALUES (?,?,?,?,?)";
			//PREPARE QUERY FOR EXECUTION
			PreparedStatement ps =connection.prepareStatement(sql);
			ps.setString(1,customer.getFirstName());
			ps.setString(2,customer.getLastName());
			ps.setString(3,customer.getPhoneNumber());
			ps.setString(4,customer.getPincode());
			ps.setString(5,customer.getRemark());
			
			int executeUpdate =ps.executeUpdate();
			ps.close();
			if(executeUpdate>0)
			{
				return true;
			}
			}
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}
		
		
		return false;
	}
	
	
	@Override
	public boolean alterDB(int id,Customer customer) {
		// TODO Auto-generated method stub
		String sql="UPDATE customer SET firstname=?,lastname=?,phonenumber=?,pincode=?,remark=? WHERE id=?";
		try {
			PreparedStatement ps =connection.prepareStatement(sql);
			ps.setString(1,customer.getFirstName());
			ps.setString(2,customer.getLastName());
			ps.setString(3,customer.getPhoneNumber());
			ps.setString(4,customer.getPincode());
			ps.setString(5,customer.getRemark());
			ps.setInt(6,id);
			int executeUpdate =ps.executeUpdate();//execute query
			ps.close();
			if(executeUpdate>0)
			{
				return true;
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean removefromDB(int id) {
		// TODO Auto-generated method stub
		String sql="DELETE FROM customer WHERE id=?";
		try {
			PreparedStatement ps =connection.prepareStatement(sql);//prepare query
			ps.setInt(1,id);
			int executeUpdate =ps.executeUpdate();//return no of rows affected
			ps.close();
			
			if(executeUpdate>0)
			{
				return true;
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
	@Override
	public void viewSingleDB(int id) {
		// TODO Auto-generated method stub
		String sql="select * FROM customer WHERE id=?";
		try {
			PreparedStatement ps =connection.prepareStatement(sql);
			ps.setInt(1,id);
			ResultSet resultSet =ps.executeQuery();//execute query and return rows
			
			if(resultSet.next()) {
				System.out.println("Customer id :" + resultSet.getInt("id"));
				System.out.println("First name :" + resultSet.getString("firstname"));
				System.out.println("Last name :" + resultSet.getString("lastname"));
				System.out.println("mobile number :" + resultSet.getString("phonenumber"));
				System.out.println("pin code :" + resultSet.getString("pincode")+"\n");
			}
			
			resultSet.close();
			ps.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@Override
	public void viewAllDB() {
		// TODO Auto-generated method stub
		String sql="select * FROM customer";
		try {
			PreparedStatement ps =connection.prepareStatement(sql);
             ResultSet resultSet =ps.executeQuery();
			System.out.printf("\n%-20s %-20s %-20s %-20s %s %n%n ","Customer id","First name","Last name","mobile number","pin code");
			while(resultSet.next()) {
				
//				System.out.println("Customer id :" + resultSet.getInt("id"));
//				System.out.println("First name :" + resultSet.getString("firstname"));
//				System.out.println("Last name :" + resultSet.getString("lastname"));
//				System.out.println("mobile number :" + resultSet.getString("phonenumber"));
//				System.out.println("pin code :" + resultSet.getString("pincode")+"\n");
				System.out.printf("\n%-20d %-20s %-20s %-20s %s %n ",resultSet.getInt("id"),resultSet.getString("firstname"),resultSet.getString("lastname"),resultSet.getString("phonenumber"),resultSet.getString("pincode"));
				
				
			}
			resultSet.close();
			ps.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	@Override
	public void viewAllDBAdvocate() {
		// TODO Auto-generated method stub
		
		String sql="select * FROM advocate";
		try {
			PreparedStatement ps =connection.prepareStatement(sql);
             ResultSet resultSet =ps.executeQuery();
             System.out.printf("\n%-20s %-20s %-20s %-20s %-20s %s %n%n ","Advocate id","First name","Last name","phone number","email","Total Experience");
			while(resultSet.next()) {
//				System.out.println("Advocate id :" + resultSet.getInt("advocate_id"));
//				System.out.println("First name :" + resultSet.getString("firstname"));
//				System.out.println("Last name :" + resultSet.getString("lastname"));
//				System.out.println("phone No. :" + resultSet.getString("phonenumber"));
//				System.out.println("email :" + resultSet.getString("email"));
//				System.out.println("years of experience :" + resultSet.getString("years_of_exp")+"\n");
				System.out.printf("\n%-20d %-20s %-20s %-20s %-20s %s %n ",resultSet.getInt("advocate_id"),resultSet.getString("firstname"), resultSet.getString("lastname"),resultSet.getString("phonenumber"),resultSet.getString("email"),resultSet.getString("years_of_exp"));
				
			}
			resultSet.close();
			ps.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


	@Override
	public boolean modifyDBappointment(int app_id,int cust_id,int adv_id ) {
		// TODO Auto-generated method stub
		String sql="UPDATE appointments SET customer_id=?,advocate_id=?,app_date=NOW() WHERE app_id=?";
		try {
			PreparedStatement ps =connection.prepareStatement(sql);
			ps.setInt(1,cust_id);
			ps.setInt(2,adv_id);
			ps.setInt(3,app_id);
			
			int executeUpdate =ps.executeUpdate();//execute query
			ps.close();
			if(executeUpdate>0)
			{
				return true;
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


	@Override
	public boolean bookDBappointment(int customer_id,int advocate_id) {
		
		try
		{
			String sql="INSERT INTO appointments(customer_id,advocate_id,app_date) VALUES (?,?,NOW())";
			//PREPARE QUERY FOR EXECUTION
			PreparedStatement ps =connection.prepareStatement(sql);
			ps.setInt(1,customer_id);
			ps.setInt(2,advocate_id);
			
			int executeUpdate =ps.executeUpdate();//no of rows affected return
			ps.close();
			if(executeUpdate>0)
			{
				return true;
			}
			}
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}
		
		
		return false;
		
		
	}


	@Override
	public boolean deleteDBappointment(int id) {
		// TODO Auto-generated method stub
		
		String sql="DELETE FROM appointments WHERE app_id=?";
		try {
			PreparedStatement ps =connection.prepareStatement(sql);//prepare query
			ps.setInt(1,id);
			int executeUpdate =ps.executeUpdate();//return no of rows affected
			ps.close();
			
			if(executeUpdate>0)
			{
				return true;
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;

		
		
	}


	@Override
	public void viewAllDBappointments() {
		// TODO Auto-generated method stub
		
		String sql="select * FROM appointments";
		try {
			PreparedStatement ps =connection.prepareStatement(sql);
             ResultSet resultSet =ps.executeQuery();
			
			while(resultSet.next()) {
				System.out.println("Appointment id :" + resultSet.getInt("app_id"));
				System.out.println("Customer id :" + resultSet.getInt("customer_id"));
				System.out.println("Advocate id :" + resultSet.getInt("advocate_id"));
				SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				System.out.println("Appointment Time:" +dateFormat.format(resultSet.getDate("app_date")));
			}
			resultSet.close();
			ps.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
