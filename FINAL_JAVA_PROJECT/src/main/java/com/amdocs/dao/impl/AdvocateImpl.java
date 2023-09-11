package com.amdocs.dao.impl;

import com.amdocs.dao.AdvocateDao;
import com.amdocs.dao.DatabaseDao;
import com.amdocs_entity.AppointmentManipulation;

public class AdvocateImpl implements AdvocateDao {
	
	DatabaseDao databaseDao=new DatabaseImpl();
    AppointmentManipulation appointmentManipulation=new AppointmentManipulation();
	@Override
	public void viewAll() {
		// TODO Auto-generated method stub
		databaseDao.viewAllDBAdvocate();
	}

	@Override
	public void modifyappointment() {
		// TODO Auto-generated method stub
		int id=appointmentManipulation.getappointment_id();
		int customer_id=appointmentManipulation.getcustomer_id();
		  int advocate_id=appointmentManipulation.getadvocate_id();
		  
		  boolean check=databaseDao.modifyDBappointment( id,customer_id,advocate_id);
		 if(check==true)
			{
				System.out.println("Updated Succesfully");
			}
			else
			{
				System.out.println("Updation Failed");

			}
		
	}

	@Override
	public void bookappointment() {
		// TODO Auto-generated method stub
	  int customer_id=appointmentManipulation.getcustomer_id();
	  int advocate_id=appointmentManipulation.getadvocate_id();
	  boolean check=databaseDao.bookDBappointment(customer_id,advocate_id);
	  if(check==true)
		{
			System.out.println("Booked Succesfully");
		}
		else
		{
			System.out.println("Booking Failed");

		}
	}

	@Override
	public void deleteappointment() {
		// TODO Auto-generated method stub
		int id=appointmentManipulation.getappointment_id();
		boolean check=databaseDao.deleteDBappointment(id);
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
	public void viewAllappointments() {
		// TODO Auto-generated method stub
		databaseDao.viewAllDBappointments();
		
	}
}
