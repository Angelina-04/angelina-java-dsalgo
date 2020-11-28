package com.myproject;

import java.util.Scanner;

public class BalanceArray {
	public static int minValueToBalance(int a[],int n) {
		int sum1 = 0; 
        for (int i = 0; i < n / 2; i++) 
            sum1 += a[i]; 
        int sum2 = 0; 
        for (int i = n/2; i < n; i++) 
            sum2 += a[i]; 
        return Math.abs(sum1 - sum2); 
    } 
	public static void main(String[] args)  { 
		int n;
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements in the array:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements of array:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
	        int p = a.length;
			System.out.println("The minimum value needed to balance the array is:"+minValueToBalance(a,p));
			sc.close();
		}
	}

