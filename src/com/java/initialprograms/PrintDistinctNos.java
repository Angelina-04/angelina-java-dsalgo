package com.java.initialprograms;

import java.util.Scanner;

public class PrintDistinctNos {
	static void printDistinct(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
        { 
            int j; 
            for (j = 0; j < i; j++) 
            if (arr[i] == arr[j]) 
                break; 
            if (i == j) 
            System.out.print( arr[i] + " "); 
        } 
    } 
	public static void main(String []args) {
		int n;
		 Scanner sc = new Scanner(System.in);
			System.out.print("Enter number of elements in the array:");
			n = sc.nextInt();
			int a[] = new int[n];
			System.out.println("Enter elements of array:");
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
	System.out.println("Distinct Elements are:");
	        printDistinct(a, n); 
	        sc.close();
	    }
	}

