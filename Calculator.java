package com.edu;
import java.util.Scanner;

public class Calculator {
int num1,num2;//instance var
Calculator(int a,int b)//a,b are local var
{
num1=a;
	num2=b;
}
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter the First Number");
		a=sc.nextInt();
		System.out.println("Enter the second Number");
		b=sc.nextInt();
		Calculator obj=new Calculator(a,b);
		System.out.println("Enter the Choice[+,-,*,/,%]:");
		String ch;
		ch=sc.next();
		char array[]=ch.toCharArray();
		switch(array[0])
		{
		case '+':System.out.println("Addition is:"+(obj.num1+obj.num2));
		break;
		case '%':System.out.println("Substraction is:"+(obj.num1%obj.num2));
		break;
		
		default:System.out.println("OOPS!!!!!Invalid Choice");
		break;
		}
	}

}