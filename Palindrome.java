package com.edu;

import java.util.Scanner;

public class Palindrome {
		public static void main(String[]args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		int num=n;
		float i=0,rev=0;

		while(n>0)
		{
		 int d=n%10;
		rev=rev*10+d;
		n=n/10;
		}
		if(rev==num)
		{
		System.out.println("the given number is palindrome");
		}
		else
		{
		System.out.println("the given number is not palindrome");
		}
	}	
}

//import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		int num, rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		int orgnum=num;
		while(num>0) { //234 > 0  , 23>0   , 2>0,  0>0
			int d = num%10; //234%10=4 , 23%10=3, 2%10
			//System.out.print(d); //432
			rev = rev*10+d; //rev = 0*10+4=4 ,rev = 4*10+3=40+3=43, rev = 43*10+2= 430+2=432
			num = num/10;  //234/10 = 23  //23/10=2  , 2/10=0
		}
		
		System.out.println("Reverse number is "+rev);
		System.out.println(orgnum);
		if(rev==orgnum) {
			System.out.println(orgnum+" is pallendrome");
		}else {
			System.out.println("Not pallendrome");
		}

	}

}//