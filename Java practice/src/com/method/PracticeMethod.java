package com.method;

public class PracticeMethod {
	
	// Method return nothing and accept nothing.
	
	void displayName(){
		String name = "Rajat kumar Sahoo";
		System.out.println("My Name is "+ name);
	}
	
	// method return something but takes no parameter
	
	int sumOfTwoNumbers(){
		int n1 = 10, n2 = 20;
		int mul = n1*n2;
		return mul;
	}

	// method return something and takes parameters
	
	boolean eligibiltyForVote(int age){
		if(age < 18) {
			return false;
		}
		return true;
			
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PracticeMethod pm = new PracticeMethod();
		pm.displayName();
		int results = pm.sumOfTwoNumbers();
		System.out.println("Results of multiplication is "+ results);
		boolean eligibilty = pm.eligibiltyForVote(15);
		if(eligibilty == false) {
			System.out.println("You cannot vote");
		if(eligibilty == true)
				System.out.println("You are eligible for vote");
		}
		m3();
		pm.m4();
		PracticeMethod2 pm2 = new PracticeMethod2();
		pm2.m10();
	}

	static void m1() {
		System.out.println("Dummy Method m1");
	}
	
	static void m2() {
		System.out.println("Dummy Method m2");
	}
	
	static void m3() {
		PracticeMethod.m1();
		PracticeMethod pm1 = new PracticeMethod(); // to call non static method in static method we need to create object first then we can call the method. 
		pm1.m4();
		pm1.m5();
		pm1.displayName();
	}
	
	void m4() {
		System.out.println("Non-static method  m4");
		m5();
		m2();  // we can call static method in non static method directly. 
		m1();
	}
	
	void m5() {
		System.out.println("Non-static method m5");
	}
}
