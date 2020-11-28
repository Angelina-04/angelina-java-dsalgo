package com.java.initialprograms;
import java.util.Scanner;

public class CountPairsWGSum {
	static void printPairs(int arr[], int n,int sum) {
			for (int i = 0; i < arr.length; i++) 
	            for (int j = i + 1; j < arr.length; j++) 
	                if ((arr[i] + arr[j]) == sum) 
	                	System.out.println("(" + arr[i] + ", " + arr[j] + ")");

	    }
 
		    public static void main(String args[]) 
		    { 
		    	int p;
				 Scanner sc = new Scanner(System.in);
					System.out.print("Enter number of elements in the array:");
					p = sc.nextInt();
					int a[] = new int[p];
					System.out.println("Enter elements of array:");
					for (int i = 0; i < p; i++) {
						a[i] = sc.nextInt();
					}
					System.out.println("Enter the sum: ");
			        int sum=sc.nextInt();
			        int n = a.length;
				    printPairs(a, n, sum);
				    sc.close();
		    } 	
} 