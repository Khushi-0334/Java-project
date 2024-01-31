package com.edu.condstmt;

import java.util.Scanner;

public class MainAppIfElse {
       public static void main(String[]args) {
    	   int num1,num2;
    	   Scanner sc=new Scanner(System.in);
    	   
    	   System.out.println("Enter first number");
    	   num1=sc.nextInt();
    	   
    	   System.out.println("Enter second number");
    	   num2=sc.nextInt();
    	   if(num1 > num2) {
   			System.out.println("The largest of "+num1+" and "+num2+" is "+num1);
   		}
   		else if(num2>num1){
   			System.out.println("The largest of "+num1+" and "+num2+" is "+num2);
   		}else {
   			System.out.println(num1+" and "+num2+" are equal");
   		}

   	}

   
       }

//Program to find the largest of two numbers



