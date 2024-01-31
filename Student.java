package com.edu.condstmt;

import java.util.Scanner;

public class Student {
String name;
int age;
float fees;

  void inputData() {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Student Name: ");
	  name=sc.next();
	  
	  System.out.println("Enter age");
	  age=sc.nextInt();
	  
	  System.out.println("Enter fees");
	  fees=sc.nextFloat();
	  
  }
  
  void displayData() {
	  System.out.println("Name ="+name);
	  System.out.println("Age ="+age);
	  System.out.println("Fees ="+fees);
  }
	public static void main(String[] args) {
         Student s1=new Student();
         Student s2=new Student();
         
         System.out.println(s1);
 		 System.out.println(s2);
         
         s1.inputData();
         s2.inputData();
         
         s1.displayData();
         s2.displayData();
	}
}

