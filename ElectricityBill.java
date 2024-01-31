package com.edu.condstmt;

import java.util.Scanner;

public class ElectricityBill {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input customer name
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        // Input number of units consumed
        System.out.print("Enter number of units consumed: ");
        int unitsConsumed = scanner.nextInt();

        // Calculate the electricity bill
        double billAmount = 0;

        if (unitsConsumed <= 100) {
            // Rate for the first 100 units
            billAmount = unitsConsumed * 2.00;
        } else if (unitsConsumed <= 300) {
            // Rate for the next 200 units
            billAmount = 100 * 2.00 + (unitsConsumed - 100) * 3.00;
        } else {
            // Rate for units above 300
            billAmount = 100 * 2.00 + 200 * 3.00 + (unitsConsumed - 300) * 4.00;
        }

        // Display the bill details
        System.out.println("\nBill Details for " + customerName);
        System.out.println("Number of units consumed: " + unitsConsumed);
        System.out.println("Electricity bill amount: Rs" + billAmount);

        scanner.close();
    }
}


