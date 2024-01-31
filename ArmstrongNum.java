package com.edu;

import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		int temp=num;
		//find no of digits
		int dcount=0;
		while(temp>0) {
			temp=temp/10;
			dcount++;
		}
		int s=0;
		temp = num;
		while(temp>0) {
			int d=temp%10;
			//s=(int) (s+Math.pow(d, dcount));
			s+=Math.pow(d, dcount);
			temp = temp/10;
		}
		if(num == s) {
			System.out.println(num+" is an armstrong number");
		}else {
			System.out.println(num+" is not an armstrong number");
		}
		
		

	}

}




