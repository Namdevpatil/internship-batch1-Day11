package com.javaInnerClasses;


//outer class
public class Address 
{
	
	//fields	
	private String doorNo;
	private String streetName;
	private long pincode;
	private String city;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String doorNo, String streetName, long pincode, String city) {
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.pincode = pincode;
		this.city = city;
	}

	public String getAddress() 
	{
		return "Address [doorNo=" + doorNo + ", streetName=" + streetName + ", pincode=" + pincode + ", city=" + city
				+ "]";
	}	
	
	//inner/nested class
	class Customer
	{
		//fields
		private int customerId;
		private String customerName;
		
		public Customer() 
		{
			// TODO Auto-generated constructor stub
		}

		public Customer(int customerId, String customerName)
		{
			this.customerId = customerId;
			this.customerName = customerName;
		}

		public String getCustomer()
		{
			return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", Address [doorNo=" + doorNo + ", streetName=" + streetName + ", pincode=" + pincode + ", city=" + city+"]";
		}		
		
	}
	

}
