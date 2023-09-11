package com.amdocs_entity;

import java.util.Scanner;


import com.amdocs.dao.CustomerDao;
import com.amdocs.dao.impl.CustomerImpl;

public class CustomerChoices {
    private Scanner sc;
    public void customerSelect()
    {
    	sc=new Scanner(System.in);
    	CustomerDao customerdao =new CustomerImpl();
    	System.out.println("----------CUSTOMER PAGE----------\n");
    	boolean flag=true;
    	while(flag)
    	{
    		System.out.println("1.Register Customer");
    		System.out.println("2.Modify Customer Details");
    		System.out.println("3.Delete Customer Record");
    		System.out.println("4.View Single Record");
    		System.out.println("5.View All Record");
    		System.out.println("0.Exit");
    		int ch=Integer.parseInt(sc.nextLine());
    		switch(ch)
    		{
    		case 1:
    			customerdao.registerCustomer();
    			break;
    		case 2:
    			customerdao.modifyCustomer();
    			break;
    		case 3:
    			customerdao.deleteCustomer();
    			break;
    		case 4:
    			customerdao.viewSingle();
    			break;
    		case 5:
    			customerdao.viewAll();
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
