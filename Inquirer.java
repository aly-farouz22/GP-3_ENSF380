package edu.ucalgary.oop;


public class Inquirer {
	private String firstName;
	private String lastName;
	private String servicesPhoneNum;
	private String info;
	
	public Inquirer(String firstName, String lastName, String servicesPhoneNum, String info) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.servicesPhoneNum = servicesPhoneNum;
		this.info = info;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getServicesPhoneNum() {
		return this.servicesPhoneNum;
	}
	
	public String getInfo() {
		return this.info;
	}
}
