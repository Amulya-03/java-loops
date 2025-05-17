package com.loops;

public class FactorialNumber {
	public static int getFactorial(int n) {
		int fact=1;
		int i=1;
		while(i<=n) {
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of "+n+" is "+fact);
		return fact;	
	}
	public static void main(String[] args) {
		getFactorial(7);
	}
}
