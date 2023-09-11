package com.amdocs.dao;

import com.amdocs_entity.Customer;

public interface DatabaseDao {
	public boolean addToDB(Customer customer);
	public boolean alterDB(int id,Customer customer);
	public boolean removefromDB(int id);
	public void viewSingleDB(int id);
	public void viewAllDB();
	public void viewAllDBAdvocate();
	public boolean modifyDBappointment(int app_id,int cust_id,int adv_id);
	public boolean bookDBappointment(int customer_id,int advocate_id);
	public boolean deleteDBappointment(int id);
	public void viewAllDBappointments();
	
	

}
