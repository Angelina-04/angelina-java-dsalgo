package com.java.basicprograms;
import java.util.Scanner;
public class CheckForCorV {
	public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        sc.close();
        int count=0,count1=0,count2=0;
        int TotalCount=0;
      for(int i=0;i<str.length();i++) {
       	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||
        			str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
        count++;
       	}
       	else if((str.charAt(i)>='a'&&str.charAt(i)<='z')) {
			count1++;
       	}
       	else if((str.charAt(i)>='A'&&str.charAt(i)<='Z')) {
			count1++;
       	}
       	TotalCount=count1+count2;
       	}
		System.out.println("Number of Consonants present are:"+TotalCount);
      System.out.println("Number of vowels present are:"+count);
	}
}


