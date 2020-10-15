package com.hcl4;

public class Owner {
	private String name;
	private String password;
	private String mobileNumber;
	public Owner()
	{
		
	}
	public Owner(String name, String password, String mobileNumber) {
		super();
		this.name = name;
		this.password = password;
		this.mobileNumber = mobileNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	void display()
	{
		System.out.println("Enter the name,password and mobile number of the user ");
		System.out.println(getName()+"\n"+getPassword()+"\n"+getMobileNumber());
		System.out.println("Name :"+getName());
		System.out.println("MobileNumber :"+getMobileNumber());
		
	}
	
}
