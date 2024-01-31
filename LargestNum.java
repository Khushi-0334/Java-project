package com.edu.largest;

public class LargestNum {

	public static void main(String[] args) {
		int a[] = {10,12,30,95,87};
		int temp=0;
	
		System.out.println("Before sorting array elements are");
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
		for(int i=0;i<a.length;i++){
			
			        for(int j=0;j<a.length-i-1;j++){
			                if(a[j]<a[j+1]){
			                     temp=a[j];
			                     a[j]=a[j+1];
			                     a[j+1]=temp; 
			                }
			         }
			

			System.out.println("Sorted elements are in descending order");
			 for(int i1=0;i1<a.length;i1++){
			         System.out.println(a[i1]);
			  }

			System.out.println("Second largest Element is  "+a[1]);
	}

 }
}
