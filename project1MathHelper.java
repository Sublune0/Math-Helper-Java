/*
* Assignment: Project 1 Math Helper
* Name: Benjamin Bever
* Date: 07/18/2025
*
* Program Description:
* This program shows a menu and lets the user choose math problems 
* like adding, dividing, or checking if a number is odd or even. 
* It repeats until the user chooses to quit.
*
* Honor Code Statement:
* I affirm that this program is my own work and that I have not
* shared this code or provided unauthorized assistance with it.
*
* Purpose:
* This project helps practice basic Java skills, using 
* if-statements, variables, Scanner input, and loops.
*
* Input:
* The user types in numbers and a letter to pick what kind 
* of math problem to do.
*
* Output:
* The program shows the answer to the math problem and keeps going 
* until the user types X to quit.
*/


package Lesson4.Project1;


import java.util.Scanner;

public class project1MathHelper {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String choice;
        boolean keepRunning = true;

        System.out.println("Welcome to the Math Helper Program!");

        while (keepRunning) {
            // Display the menu
            System.out.println("\nPlease choose an option:");
            System.out.println("A. Addition");
            System.out.println("B. Subtraction");
            System.out.println("C. Multiplication");
            System.out.println("D. Division");
            System.out.println("E. Odd/Even");
            System.out.println("F. Other Calculations");
            System.out.println("X. Exit");

            System.out.print("Enter your choice: ");
            choice = scnr.nextLine().trim().toUpperCase();

            if (choice.equals("A")) {
                System.out.print("Enter the first number: ");
                double num1 = scnr.nextDouble();
                System.out.print("Enter the second number: ");
                double num2 = scnr.nextDouble();
                System.out.println("Result: " + (num1 + num2));
                scnr.nextLine(); // clear buffer

            } else if (choice.equals("B")) {
                System.out.print("Enter the first number: ");
                double num1 = scnr.nextDouble();
                System.out.print("Enter the second number: ");
                double num2 = scnr.nextDouble();
                System.out.println("Result: " + (num1 - num2));
                scnr.nextLine(); // clear buffer

            } else if (choice.equals("C")) {
                System.out.print("Enter the first number: ");
                double num1 = scnr.nextDouble();
                System.out.print("Enter the second number: ");
                double num2 = scnr.nextDouble();
                System.out.println("Result: " + (num1 * num2));
                scnr.nextLine(); // clear buffer

            } else if (choice.equals("D")) {
                System.out.print("Enter the first number: ");
                double num1 = scnr.nextDouble();
                System.out.print("Enter the second number: ");
                double num2 = scnr.nextDouble();
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                scnr.nextLine(); // clear buffer

            } else if (choice.equals("E")) {
                System.out.print("Enter the starting value: ");
                int start = scnr.nextInt();
                System.out.print("Enter the ending value: ");
                int end = scnr.nextInt();
                scnr.nextLine(); // clear buffer

                System.out.print("Odd numbers: ");
                for (int i = start; i <= end; i++) {
                    if (i % 2 != 0) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();

                System.out.print("Even numbers: ");
                for (int i = start; i <= end; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();

            } else if (choice.equals("F")) {
                // Other Calculations Menu
                System.out.println("\nOther Calculations:");
                System.out.println("1. Area of a rectangle");
                System.out.println("2. Perimeter of a rectangle");
                System.out.println("3. Simple Interest");
                System.out.println("4. GPA Calculator");
                System.out.print("Choose an option (1-4): ");
                int option = scnr.nextInt();

                if (option == 1) {
                    System.out.print("Enter length: ");
                    double length = scnr.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scnr.nextDouble();
                    System.out.println("Area: " + (length * width));
                } else if (option == 2) {
                    System.out.print("Enter length: ");
                    double length = scnr.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scnr.nextDouble();
                    System.out.println("Perimeter: " + (2 * (length + width)));
                } else if (option == 3) {
                    System.out.print("Enter principal: ");
                    double principal = scnr.nextDouble();
                    System.out.print("Enter rate (as a %): ");
                    double rate = scnr.nextDouble();
                    System.out.print("Enter time (in years): ");
                    double time = scnr.nextDouble();
                    double interest = (principal * rate * time) / 100;
                    System.out.println("Simple Interest: " + interest);
                } else if (option == 4) {
                    System.out.print("Enter total grade points earned: ");
                    double points = scnr.nextDouble();
                    System.out.print("Enter total credit hours: ");
                    double hours = scnr.nextDouble();
                    if (hours != 0) {
                        System.out.println("GPA: " + (points / hours));
                    } else {
                        System.out.println("Error: Credit hours cannot be zero.");
                    }
                } else {
                    System.out.println("Invalid option.");
                }
                scnr.nextLine(); // clear buffer

            } else if (choice.equals("X")) {
                System.out.println("Thanks for using the Math Helper. Goodbye!");
                keepRunning = false;

            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }

        scnr.close();
    }
}
