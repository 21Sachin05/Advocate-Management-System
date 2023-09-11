package com.amdocs_entity;

import java.util.Scanner;

public class AppointmentManipulation {
	
	private Scanner sc= new Scanner(System.in);
	
	 public int getcustomer_id() {
		 System.out.println("Enter Customer id");
		 int id=Integer.parseInt(sc.nextLine());
		 return id;
	 }
	 
	 public int getadvocate_id() {
		 System.out.println("Enter advocate id");
		 int id=Integer.parseInt(sc.nextLine());
		 return id;
		 
		 
	 }
	 public int getappointment_id() {
		 System.out.println("Enter appointment id");
		 int id=Integer.parseInt(sc.nextLine());
		 return id;
	 }

}
