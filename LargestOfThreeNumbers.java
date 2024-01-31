package com.edu.condstmt;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    int n1,n2,n3;
    
    void inputData() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter 3 numbers");
    	n1=sc.nextInt();
    	n2=sc.nextInt();
    	n3=sc.nextInt();
    }
    void largestNumber() {
    	if(n1>n2 && n1>n3) {
    		System.out.println("The largest of "+n1+", "+n2+" , "+n3+" is "+n1);
    	}
    	else if(n2>n1 && n2>n3) {
    		System.out.println("The largest of "+n1+" , "+n2+" , "+n3+" is "+n2);
    }
    	else {
    		System.out.println("The largest of "+n1+" , "+n2+" , "+n3+" is "+n3);
    	}
}
public static void main(String[] args) {
		
		LargestOfThreeNumbers obj = new LargestOfThreeNumbers();
		obj.inputData();
		obj.largestNumber();
		
		//create one more object test your program another set of values
	}
}