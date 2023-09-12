package com.amdocs_entity;

import java.util.Scanner;

import com.amdocs.exception.SystemException;

public class CustomerManipulation {
	 private Scanner sc= new Scanner(System.in);
	 Customer customer;
	 public Customer takeInput()
	 {
		 
		 customer =new Customer();
		 try {
		 
		 System.out.println("Please Enter your First Name");
		 String firstName=sc.nextLine();
		 customer.setFirstName(firstName);
		 
		 System.out.println("Please Enter your Last Name");
		 String lastName=sc.nextLine();
		 customer.setLastName(lastName);
		 
		 System.out.println("Please Enter your Phone Number");
		 String phoneNumber=sc.nextLine();
		 customer.setPhoneNumber(phoneNumber);
		 
		 System.out.println("Please Enter your pincode");
		 String pincode=sc.nextLine();
		 customer.setPincode(pincode);
		 
		 System.out.println("Please Enter your remark");
		 String remark=sc.nextLine();
		 customer.setRemark(remark);
		 }catch(NumberFormatException e) {
			 System.out.println("Invalid Input");
		 }
			 
		 
		 return customer;
 
	 }
	 
	 public int takeId() {
		 System.out.println("Please Enter your id");
		 int id=Integer.parseInt(sc.nextLine());
		 
		 return id;
	 }

}
