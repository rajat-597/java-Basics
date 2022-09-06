package com.method;

public class IdCard {

	final String COMPANY = "Clairvoyant";
	final String ADDRESS = "Baner, Pune";
	final long PHONE = 72054932;
	
	String name;
	String department;
	String bloodGroup;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IdCard ic1 = new IdCard(); // instance of class, we can able to create any number of instances of the class.
	   System.out.println("Value for name should be default value "+ ic1.name);
	 boolean voters = ic1.checkEligibility(10);
		if(voters == true) {
			System.out.println("Eligible for vote !! Give him bike so he can vote");
		}else
			System.out.println("No freebie");
		
	}
	
	// write functionality for eligibility for vote 
	
	boolean checkEligibility(int age) {
		boolean isValue = false;
		if(age >= 18) {
			return true;
		}else
			return isValue;
	
		}

}
