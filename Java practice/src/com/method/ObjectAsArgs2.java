package com.method;

public class ObjectAsArgs2 {
	
	ObjectAsArgs e;
	String details;
	
	
	// passing object as an arguments
	
	void employeeDetails(ObjectAsArgs e) {
		System.out.println("Employee details "+ e.getAge() + " "+ e.getsalary() + " "+ e.getName() );
	}

	// passing object as return type
	
	ObjectAsArgs populateDetails() {
		ObjectAsArgs oa = new ObjectAsArgs(24, 32500, "Sumeet");
		return oa;
	}
	
	public static void main(String [] args) {
		ObjectAsArgs oa = new ObjectAsArgs(26, 36000.35, "Rajat Kumar Sahoo");
		ObjectAsArgs2 oa2 = new ObjectAsArgs2();
		oa2.employeeDetails(oa);
		ObjectAsArgs emp = oa2.populateDetails();
		System.out.println("------- " + emp.getName());
		System.out.println("------- Age of Sumeet is "+ emp.age);
		
	}
}

       


