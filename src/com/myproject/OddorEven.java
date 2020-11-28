package com.myproject;
import java.util.Scanner;
public class OddorEven {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the Number:");
	    int a=sc.nextInt();
	    if (a % 2==0) {
	    	 System.out.println("The number is a Even Number");
	    }else {
	    	System.out.println("The number is a O Number");
	   }
	    sc.close();
	
}

}
