package com.java.basicprograms;
import java.util.Scanner;
public class CheckForPalindrome {
	static void checkPalindrome(String str) {
		int i=0;int j=str.length()-1;
		if(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				i++;
				j--;
				System.out.println("The given string is not a Palindrome");
			}
			else {
				System.out.println("The given string is a Palindrome");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Is the value a String or Number?(Enter St or No)");
		String ch=sc.nextLine();
		if(ch.equals("No")) {
			System.out.println("Enter the number to be checked: ");
			int value=sc.nextInt();
	        int rem,rev=0;
	        int temp=value;
	        while(temp>0) {
	        	rem=temp%10;
	        	rev=(rev*10)+rem;
	        	temp=temp/10;
	        }
	        if(value==rev) {
	        	System.out.println("The given number is a palindrome");
	        }
	        else {
	        	System.out.println("The given number is not a palindrome");
	        }		
		}
		else if(ch.equals("St")) {
			System.out.println("Enter the String: ");
			String value1=sc.next();
			checkPalindrome(value1);
			
		}
		else{
			System.out.println("Enter the correct char");
		}
		sc.close();
		
        
		}

}
