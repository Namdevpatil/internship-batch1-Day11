package com.javaInnerClasses;

import com.javaInnerClasses.Address.Customer;

public class TestClass {

	public static void main(String[] args) {
		
		
		//outer class object
		Address address = new Address("Flat 2001, Trump Towers", "Hitech City", 500045, "Hyderabad");
	
		System.out.println(address.getAddress());
		
		System.out.println("-----------------------------------------------------------------------------");
	
		//inner class object
		
		Customer customer = address.new Customer(1001, "Ramesh");
		
		System.out.println(customer.getCustomer());
		
	}

}
