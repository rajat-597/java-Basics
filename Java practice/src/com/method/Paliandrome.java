package com.method;

import java.util.Scanner;

public class Paliandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
	
		int res = 0 , rem;
		int on = num;
				
		
		while(num>0) {
			rem = num%10;
			res = res*10+rem;
			num = num/10;
		}
		if(on == res) {
			System.out.println("paliandrome number");
		}else {
			System.out.println("Not paliandrome");
		}

	}

}
