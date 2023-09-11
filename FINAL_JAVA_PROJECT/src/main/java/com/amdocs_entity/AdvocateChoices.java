package com.amdocs_entity;

import java.util.Scanner;

import com.amdocs.dao.AdvocateDao;
import com.amdocs.dao.CustomerDao;
import com.amdocs.dao.impl.AdvocateImpl;
import com.amdocs.dao.impl.CustomerImpl;

public class AdvocateChoices {
	 private Scanner sc;
	    public void advocateSelect()
	    {
	    	sc=new Scanner(System.in);
	    	AdvocateDao advocatedao =new AdvocateImpl();
	    	System.out.println("----------ADVOCATE PAGE----------\n");
	    	boolean flag=true;
	    	while(flag)
	    	{
	    		System.out.println("1.VIEW ALL RECORD");
	    		System.out.println("2.MODIFY APPOINTMENT");
	    		System.out.println("3.BOOK APPOINTMENT");
	    		System.out.println("4.DELETE APPOINTMENT");
	    		System.out.println("5.DISPLAY ALL APPOINTMENTS");

	    		
	    		System.out.println("0.Exit");
	    		int ch=Integer.parseInt(sc.nextLine());
	    		switch(ch)
	    		{
	    		
	    		
	    		
	    		case 1:
	    			advocatedao.viewAll();
	    			break;
	    		case 2: 
	    			advocatedao.modifyappointment();
	    			break;
	    		case 3: 
	    			advocatedao.bookappointment();
	    			break;
	    		case 4: 
	    			advocatedao.deleteappointment();
	    			break;
	    		case 5: 
	    			advocatedao.viewAllappointments();
	    			break;
	    		case 0:
	    			System.out.println("Return to the Home Page...");
	    			flag=false;
	    			break;
	    			default:
	    				System.out.println("Invalid Choice....Try Again...");
	    				break;
	    		}
	    	}
	    }

	
	
}
