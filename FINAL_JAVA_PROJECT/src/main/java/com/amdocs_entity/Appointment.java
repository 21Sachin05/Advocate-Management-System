package com.amdocs_entity;

public class Appointment {
	 int app_id;
     int customer_id;
     int advocate_id;
     String app_date;
                      // caseType;
	public int getApp_id() {
		return app_id;
	}
	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getAdvocate_id() {
		return advocate_id;
	}
	public void setAdvocate_id(int advocate_id) {
		this.advocate_id = advocate_id;
	}
	public String getApp_date() {
		return app_date;
	}
	public void setApp_date(String app_date) {
		this.app_date = app_date;
	}
	@Override
	public String toString() {
		return "Appointment [app_id=" + app_id + ", customer_id=" + customer_id + ", advocate_id=" + advocate_id
				+ ", app_date=" + app_date + "]";
	}
	
	
	
	
}
