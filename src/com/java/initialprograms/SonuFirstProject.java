package com.java.initialprograms;

public class SonuFirstProject {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		int[] arr=new int[3];
		arr[0]=1000;
		arr[1]=2000;
		arr[2]=3000;
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
			
		}
		System.out.println("My sum : "+ sum);
	}
}
