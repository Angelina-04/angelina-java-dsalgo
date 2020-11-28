package com.myproject;
import java.util.Arrays;
import java.util.Scanner;
public class pushZerosToEnd {
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
    int pos = 0;
    for(int i=0; i<arr.length; i++){
       if(arr[i]!=0){
          arr[pos]=arr[i];
          pos++;
       }
    }
    while(pos<arr.length) {
       arr[pos] = 0;
       pos++;
    }
    System.out.println("The array created is: "+Arrays.toString(arr));
    sc.close();
 }
}
