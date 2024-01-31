package com.edu;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		int num, rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		
		while(num>0) { //234 > 0  , 23>0   , 2>0,  0>0
			int d = num%10; //234%10=4 , 23%10=3, 2%10
			//System.out.print(d); //432
			rev = rev*10+d; //rev = 0*10+4=4 ,rev = 4*10+3=40+3=43, rev = 43*10+2= 430+2=432
			num = num/10;  //234/10 = 23  //23/10=2  , 2/10=0
		}
		
		System.out.println("Reverse number is "+rev);

	}

}
