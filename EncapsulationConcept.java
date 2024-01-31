package com.edu.condstmt;

import java.util.Scanner;

public class EncapsulationConcept {
int num1,num2;

void inputData() {
	Scanner sc = new Scanner(System.in);
	
	//input
		System.out.println("Enter first number");
		num1 = sc.nextInt();
		
		System.out.println("Enter second number");
		num2 = sc.nextInt();
}

void largestTwo() {
	//checking
			if(num1 > num2) {
				System.out.println("The largest of "+num1+" and "+num2+" is "+num1);
			}
			else if(num2>num1){
				System.out.println("The largest of "+num1+" and "+num2+" is "+num2);
			}else {
				System.out.println(num1+" and "+num2+" are equal");
			}

}
public static void main(String[]args) {
	System.out.println("main");
	int k;
	EncapsulationConcept myobj = new EncapsulationConcept();
	System.out.println("num1 ="+myobj.num1);
	System.out.println("num2 ="+myobj.num2);
	myobj.inputData();
	System.out.println("num1 ="+myobj.num1);
	System.out.println("num2 ="+myobj.num2);
	
	myobj.largestTwo();
 }
}
