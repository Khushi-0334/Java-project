package com.edu;

import java.util.Scanner;

public class FactorsOfNum {
	public static void main(String[] args) {
		int num,f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
         
		
		num = sc.nextInt();
		
		int i=1;
		while(i<=num) { //1 2 3 4 5 6
		 if(num%i==0) {
			 System.out.println(i);
		 }
		 i=i+1;
		}
		
	}

	}


