package com.java.basicprograms;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number:");
		double a=sc.nextDouble();
		System.out.print("Enter the second number:");
		double b=sc.nextDouble();
		System.out.print("Choose char accordingingly to your operator:+,-,*,/,%,^,p: ");
		char ch=sc.next().charAt(0);
		sc.close();
		double sol;
		if(a>=0&&b>=0) {
		switch(ch) {
		case '+':
			sol=a+b;
			break;
		case '-':
			sol=a-b;
			break;
		case '*':
			sol=a*b;
			break;
		case '/':
			sol=a/b;
			break;
		case '%':
			sol=a%b;
			break;
		case '^':
			sol=Math.pow(a, b);
			break;
		case 'p':
			sol=a*b*3.14;
			break;
		default:
			System.out.println("Entered operator is incorrect.Please try again.");
			return;
		}
		System.out.println(a +" " +ch +" " +b +"=" +" " +sol);
	}
		else {
		System.out.println("The numbers entered are invalid.");
	}
	}
}