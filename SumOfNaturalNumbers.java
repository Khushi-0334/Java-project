package com.edu;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
       int n,sum=0;
       Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the value of n");
	   
	   n=sc.nextInt();
	   
	   int i=1;
	   while(i<=n) {
		   sum=sum+i;
		   i=i+1;
	   }
		System.out.println("sum of 1 to 10 natural numbers is" +sum);
		
	}

}
