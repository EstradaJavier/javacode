package main.java.javafx525;

import java.util.Scanner;

//Write a program to print the first N numbers in the Fibonacci sequence.

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "";  // Initialize choice with an empty string

        do {
            try {
                // Prompt user to enter the number of terms
                System.out.print("Enter the number of terms: ");
                int n = scanner.nextInt();

                if (n <= 0) {
                    throw new IllegalArgumentException("Number of terms must be positive");
                }

                // Variables to store the first two terms of the sequence
                int a = 0, b = 1;

                System.out.println("Fibonacci sequence up to " + n + " terms:");

                // Print the first N terms of the Fibonacci sequence
                for (int i = 1; i <= n; i++) {
                    System.out.print(a + " ");
                    // Calculate the next term
                    int next = a + b;
                    a = b;
                    b = next;
                }
                System.out.println();

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                scanner.nextLine(); // Consume newline character
            }

            // Ask the user if they want to try again
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Do you want to try again? (yes/no): ");
                choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("no")) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                }
            }
        } while (choice.equalsIgnoreCase("yes"));

        scanner.close();
        System.out.println("Thank you for playing.");
    }
}

