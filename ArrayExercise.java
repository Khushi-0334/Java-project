package com.edu.arraydemo;

public class ArrayExercise {
	
		public static void main(String[] args) {
			int[] numbers = {55, 80, 12, 14, 70, 61};
	        int sum = 0;
	        for (int num : numbers) {
	            sum += num;
	        }
	        double average = (double) sum / numbers.length;
	        int max = Integer.MIN_VALUE;
	        int min = Integer.MAX_VALUE;
	        for (int num : numbers) {
	            if (num > max) {
	                max = num;
	            }
	            if (num < min) {
	                min = num;
	            }
	        } 
	        System.out.println("Sum: " + sum);
	        System.out.println("Average: " + average);
	        System.out.println("Maximum: " + max);
	        System.out.println("Minimum: " + min);
			    }
		

}
