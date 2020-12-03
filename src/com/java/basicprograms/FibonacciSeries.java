package com.java.basicprograms;
import java.util.Scanner;
public class FibonacciSeries {
	  public static void main(String[] args) {
	         Scanner sc=new Scanner(System.in);
             System.out.println("Enter the number you want the fibonacci series till :");
             int num=sc.nextInt();
             sc.close();
             int num1=0,num2=1,num3 = 0,i=1;
             System.out.println("The fibonacci series till " +num +" is");
             while(i<=num) {
            	 System.out.print(num1 +" ");
            	 num3=num1+num2;
            	 num1=num2;
            	 num2=num3;
            	 i++;
                 }
	  }
}
