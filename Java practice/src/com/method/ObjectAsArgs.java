package com.method;

public class ObjectAsArgs {

// Employee details 
	
	 int age;
	 double salary;
	 String name;
	
	 public ObjectAsArgs(int a, double sal, String Name) {
		 age = a;
		 salary = sal;
		 name = Name;
	 }

	int getAge() {
		return age;
	}
	
	double getsalary() {
		return salary;
	}
	
	String getName() {
		return name;
	}

}
