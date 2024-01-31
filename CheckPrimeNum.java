package com.edu;


	import java.util.Scanner;

	public class CheckPrimeNum {

		public static void main(String[] args) {
			int num;
			int c=0;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number");
			num = sc.nextInt();
			
			for(int i=1;i<=num;i++) {
				if(num%i == 0) {
					c++;
				}
			}
			System.out.println("c="+c);
			if(c==2) {
				System.out.println(num+" is prime number");
			}else {
				System.out.println(num+" is not a prime number");
			}

		}

	}

