package com.edu.assign;

import java.util.Scanner;

public class ShowRoom {
	// Instance variables
    String name;
    long mobno;
    double cost;
    double dis;
    double amount;
    
    
 // Default constructor
    public ShowRoom() {
        name = "";
        mobno = 0;
        cost = 0.0;
        dis = 0.0;
        amount = 0.0;
}
    // Method to input customer information
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        name = sc.nextLine();

        System.out.print("Enter mobile number: ");
        mobno = sc.nextLong();

        System.out.print("Enter cost of items purchased: ");
        cost = sc.nextDouble();
    }
 // Method to calculate discount based on criteria
    public void calculate() {
        if (cost <= 10000) {
            dis = 0.05 * cost; // 5% discount for cost <= 10000
        } else if (cost <= 20000) {
            dis = 0.10 * cost; // 10% discount for cost > 10000 and <= 20000
        } else if (cost <= 35000) {
            dis = 0.15 * cost; // 15% discount for cost > 20000 and <= 35000
        } else {
            dis = 0.20 * cost; // 20% discount for cost > 35000
        }

        amount = cost - dis;
    }
    
    
 // Method to display customer details and amount to be paid after discount
    public void display() {
        System.out.println("\nCustomer Details:");
        System.out.println("Name: " + name);
        System.out.println("Mobile Number: " + mobno);
        System.out.println("Cost of Items Purchased: Rs." + cost);
        System.out.println("Discount: Rs." + dis);
        System.out.println("Amount to be Paid After Discount: Rs." + amount);
    }

    
    public static void main(String[] args) {
        ShowRoom customer = new ShowRoom();

        // Input customer information
        customer.input();

        // Calculate discount
        customer.calculate();

        // Display results
        customer.display();
    }
}