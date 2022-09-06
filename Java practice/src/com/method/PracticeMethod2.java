package com.method;

public class PracticeMethod2 {

	static void m7() {
		System.out.println("Static method m7");
		PracticeMethod2.m8();
		PracticeMethod.m1();
	}

	static void m8() {
		System.out.println("Static method m8");
	}

	void m9() {
		System.out.println("non Static method m9");
	}

	void m10() {
		System.out.println("non Static method m10");
		PracticeMethod.m2();
		PracticeMethod2.m7();
		m8();
		// calling non static method of PracticeMethod in PracticeMethod2.create an object for that.
		PracticeMethod pm3 = new PracticeMethod();
		pm3.m5();
	}
}
