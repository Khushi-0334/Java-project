package com.edu;

public class SumSeries {
	 public static void main(String[] args) {
		 int i = 1;
		 float sum=0;
		 
		 while(i<=10) {
			 sum=sum+(float)1/i;
			 i=i+1;
		 }
		 System.out.println(sum);
	 }
}
