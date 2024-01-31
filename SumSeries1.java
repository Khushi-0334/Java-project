package com.edu;

public class SumSeries1 {
	public static void main(String[] args) {
		int i=1;
		float sum=0;
		
		while(i<=10) {
			if(i%2==0) {
				sum = sum-(float)1/i;
			}
			else
			{
				sum = sum+(float)1/i;
			}
			i=i+1;
		}
		
		System.out.println(sum);
	}

}
