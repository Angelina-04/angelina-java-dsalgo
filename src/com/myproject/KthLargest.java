package com.myproject;
import java.util.Arrays; 
public class KthLargest {
	    public static int kthLargest(Integer[] arr,int k) 
	    { 
	        Arrays.sort(arr); 
	        return arr[k - 1]; 
	    } 
	    public static void main(String[] args) 
	    { 
	        Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 }; 
	        int k = 1; 
	        System.out.print("K'th largest element is " + kthLargest(arr, k)); 
	    } 
	}
