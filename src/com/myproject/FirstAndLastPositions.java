package com.myproject;
import java.util.Scanner;

class FirstAndLastPositions { 
    public static void findFirstAndLast(int arr[], int x) 
    { 
        int n = arr.length; 
        int first = -1, last = -1; 
        for (int i = 0; i < n; i++) { 
            if (x != arr[i]) 
                continue; 
            if (first == -1) 
                first = i; 
            last = i; 
        } 
        if (first != -1) { 
            System.out.println("First Occurrence = " + first); 
            System.out.println("Last Occurrence = " + last); 
        } 
        else
            System.out.println("Not Found"); 
    } 
  
    public static void main(String[] args) { 
    	int n;
		 Scanner sc = new Scanner(System.in);
			System.out.print("Enter number of elements in the array:");
			n = sc.nextInt();
			int a[] = new int[n];
			System.out.println("Enter elements of array:");
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
        System.out.println("Enter the element: ");
        int x=sc.nextInt();
		findFirstAndLast(a, x); 
		sc.close();
        }
    } 
