package com.java.basicprograms;
import java.util.Scanner;
public class CheckingOorEAndLP {
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number:");
	int a=sc.nextInt();
	sc.close();
	if(a%2==0) {
		System.out.println("The given Number is a even Number");
	}
	else {
		System.out.println("The given Number is a odd Number");
	}
	if(a%400==0) {
       System.out.println("It is a leap year");		
	}
	else if(!(a%100==0) && a%4==0){
		System.out.println("It is a leap year");
	}
	else {
		System.out.println("It is not a leap Year");
	}
	
	}
}