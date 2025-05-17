package com.loops;

public class ArmstrongNumber {
	public void getArmstrong(int num) {
		int temp = num;
		int count = 0;
		int sum = 0;
		if(num<0) 
		   System.out.println("Enter valid Input");
		
		while(num!=0)
		{
			int rem=num%10;
			sum +=rem*rem*rem;
			num/=10;
			count++;	
		}
		System.out.println((temp==sum)?temp+" is Armstrong":temp+" is Not armstrong");
		
	}
	public static void main(String[] args) {
		ArmstrongNumber a=new ArmstrongNumber();
				a.getArmstrong(153);

	}
}
