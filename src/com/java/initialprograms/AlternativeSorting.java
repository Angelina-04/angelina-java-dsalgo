package com.java.initialprograms;
import java.io.*; 
import java.util.Arrays;
import java.util.Scanner; 
   
public class AlternativeSorting {
	 static void alternateSort(int arr[], int n) 
    { 
        Arrays.sort(arr); 
        int i = 0, j = n-1; 
        while (i < j) { 
            System.out.print(arr[j--] + " "); 
            System.out.print(arr[i++] + " "); 
        } 
        if (n % 2 != 0) 
            System.out.print(arr[i]); 
    } 

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the size of the array that is to be created: ");
	    int size = sc.nextInt();
	    int[] arr = new int[size];
	    System.out.println("Enter the elements of the array: ");
	    for(int i=0; i<size; i++){
	       arr[i] = sc.nextInt();
	    }
	    System.out.println("The array created is: "+Arrays.toString(arr));
	    System.out.println("Resultant array: ");
	    int p = arr.length; 
	    alternateSort(arr,p);
	    sc.close();
	}
}
