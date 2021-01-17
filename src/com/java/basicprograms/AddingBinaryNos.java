package com.java.basicprograms;
import java.util.Scanner;
public class AddingBinaryNos {
	    public int ConvertToDec(int binaryNo){
	    	int decimal=0;
		    int n=0;
		    while(true){  
		        if(binaryNo == 0){  
		          break;  
		        } else {  
		            int temp = binaryNo%10;
		            decimal += temp*Math.pow(2, n);  
		            binaryNo = binaryNo/10;
		            n++;
		         }
		  }
			return decimal;
	    }
	    public void ConvertToBinary(int decNo) {
	    	int binary[] = new int[20];    
	        int index = 0;    
	        while(decNo > 0){    
	            binary[index++] = decNo%2;    
	            decNo = decNo/2;    
	          }    
	          for(int i = index-1;i >= 0;i--){    
	              System.out.print(binary[i]);    
	          }
	    }
	    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    AddingBinaryNos obj=new AddingBinaryNos();
	    AddingBinaryNos obj1=new AddingBinaryNos();
	    System.out.println("Enter the first Binary No:");	
	    int a1=sc.nextInt();
	    int d1=obj.ConvertToDec(a1);
	    System.out.println("Enter the second Binary No:");	
	    int a2=sc.nextInt();
	    int d2=obj.ConvertToDec(a2);
	    sc.close();
	    int sum=d1+d2;
	    System.out.print("The sum of 2 Binary nos is:");    
	    obj1.ConvertToBinary(sum);
	    
}
}
