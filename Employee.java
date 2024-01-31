package com.edu.condstmt;

import java.util.Scanner;

public class Employee {
String empname;
int empid;
float empsalary;

void inputData() {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Employee Name");
	  empname=sc.next();
	  
	  System.out.println("Enter id");
	  empid=sc.nextInt();
	  
	  System.out.println("Enter Salary");
	  empsalary=sc.nextFloat();
}
void displayData() {
	  System.out.println("Name ="+empname);
	  System.out.println("id ="+empid);
	  System.out.println("Salary ="+empsalary);
}
     @Override
     public String toString() {
	 return "Employee [name=" + empname + ", id=" + empid + ", salary=" + empsalary + "]";
  }
     public static void main(String[] args) {
    	 Employee e1=new Employee();
    	 Employee e2=new Employee();
 		 Employee e3=new Employee();
 		System.out.println(e1);
 		System.out.println(e2);
 		System.out.println(e3);
 		
 		
 		e1.inputData();
 		e2.inputData();
 		e3.inputData();
 		
 		System.out.println(e1);
 		System.out.println(e2);
 		System.out.println(e3);
 		
 		e1.displayData();
 		e2.displayData();
 		e3.displayData();
 		
 	}


}
