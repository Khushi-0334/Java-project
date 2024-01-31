//Program to print 1 to 1000 all armstrong numbers
package com.edu;

public class AllArmStrongNumber1To1000 {

	public static void main(String[] args) {
		int num;
		num=1;
		while(num<=1000) {
			
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
				System.out.println(num);
			}
			
			num=num+1;
		}

	}

}