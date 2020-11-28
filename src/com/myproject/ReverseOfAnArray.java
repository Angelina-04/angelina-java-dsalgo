package com.myproject;

import java.util.Scanner;
public class ReverseOfAnArray {
		public static void main(String args[]) {
			int temp,size,i=0,j=0;
			int num[]=new int[50];
	        Scanner sc=new Scanner(System.in);
	        System.out.print("How many elements you want to enter: ");
	        size=sc.nextInt();

	        for(i=0; i<size; i++)
	    	{
	    	    System.out.print("Enter Array Element"+(i+1)+": ");
	    	    num[i] = sc.nextInt();
	    	}
	        j = i - 1;     
	      	i = 0;         
            while (i < j) {
	  			temp = num[i];
	  			num[i] = num[j];
	  			num[j] = temp;
	  			i++;
	  			j--;
	          }
            
	        System.out.print("Reversed array: ");
	      	for(i=0; i<size; i++)
	      	{
	      	   System.out.print(num[i]+ "  ");
	           	sc.close();
	      	}
		}
	}

