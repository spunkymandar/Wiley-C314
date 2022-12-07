package com.beans;

public class Customer {
	int customerId;
	String aadharId;
	String customerName;
	
	public Customer() {
		
	}
	
	public Customer(int customerId, String customerName){
		this.customerId=customerId;
		this.customerName=customerName;
	}
	
	public Customer(String aadharId, String customerName) {
		this.aadharId=aadharId;
		this.customerName=customerName;
	}
	
	public String toString() {
		return customerId +" "+aadharId +" "+customerName;
	}
	
	
	

}
