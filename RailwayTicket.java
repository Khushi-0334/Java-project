package com.edu.assign;
import java.util.Scanner;

public class RailwayTicket {
	// Instance variables
    String name;
    String coach;
    long mobno;
    int amt;
    int totalamt;

    // Method to accept input for name, coach, mobile number, and amount
    public void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        name = sc.nextLine();

        System.out.print("Enter coach type (First_AC/Second_AC/Third_AC/sleeper): ");
        coach = sc.nextLine();

        System.out.print("Enter mobile number: ");
        mobno = sc.nextLong();

        System.out.print("Enter basic amount of the ticket: ");
        amt = sc.nextInt();
    }

    // Method to update the amount based on the coach selected
    public void update() {
        if ("First_AC".equals(coach)) {
            totalamt = amt + 700;
        } else if ("Second_AC".equals(coach)) {
            totalamt = amt + 500;
        } else if ("Third_AC".equals(coach)) {
            totalamt = amt + 250;
        } else if ("sleeper".equals(coach)) {
            totalamt = amt; // No additional cost for sleeper coach
        } else {
            System.out.println("Invalid coach type entered.");
        }
    }

    // Method to display all details of a customer
    public void display() {
        System.out.println("\nCustomer Details:");
        System.out.println("Name: " + name);
        System.out.println("Coach: " + coach);
        System.out.println("Mobile Number: " + mobno);
        System.out.println("Total Amount: " + totalamt);
    }

    public static void main(String[] args) {
        RailwayTicket ticket = new RailwayTicket();

        // Input customer information
        ticket.accept();

        // Update amount based on coach
        ticket.update();

        // Display customer details
        ticket.display();
    }
}

