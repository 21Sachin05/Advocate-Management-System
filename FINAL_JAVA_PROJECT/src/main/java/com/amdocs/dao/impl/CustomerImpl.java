package com.amdocs.dao.impl;

import com.amdocs.dao.CustomerDao;
import com.amdocs.dao.DatabaseDao;
import com.amdocs_entity.Customer;
import com.amdocs_entity.CustomerManipulation;

public class CustomerImpl implements CustomerDao {

	DatabaseDao databaseDao=new DatabaseImpl();
	
	
	@Override
	public void registerCustomer() {
		
		//customermanipulaion class takes data from user to run query

		
		CustomerManipulation customerInput=new CustomerManipulation();
		Customer customer=customerInput.takeInput();
		boolean check =databaseDao.addToDB(customer);
		if(check==true)
		{
			System.out.println("Inserted Succesfully");
		}
		else
		{
			System.out.println("Insertion Failed");

		}
		
		
		
	}

	@Override
	public void modifyCustomer() {
		CustomerManipulation customerInput=new CustomerManipulation();
		int id=customerInput.takeId();
		Customer customer=customerInput.takeInput();
		
		boolean check = databaseDao.alterDB(id,customer);
		if(check==true)
		{
			System.out.println("Modified Succesfully");
		}
		else
		{
			System.out.println("Modication Failed");

		}
	}

	@Override
	public void deleteCustomer() {
		// TODO Auto-generated method stub
		//customermanipulaion class takes data from user to run query
		CustomerManipulation customerInput=new CustomerManipulation();
		int id=customerInput.takeId();
		//database dao class runs query using tha
       //data from customer manipulation class
		boolean check = databaseDao.removefromDB(id);
		if(check==true)
		{
			System.out.println("Deleted Succesfully");
		}
		else
		{
			System.out.println("Deletion Failed");

		}
	}

	@Override
	public void viewSingle() {
		
		CustomerManipulation customerInput=new CustomerManipulation();
		int id=customerInput.takeId();
		
		databaseDao.viewSingleDB(id);
	}

	@Override
	public void viewAll() {
		// TODO Auto-generated method stub
		databaseDao.viewAllDB();
		
	}
	
 
}
