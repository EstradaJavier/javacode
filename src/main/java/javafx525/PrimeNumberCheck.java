package main.java.javafx525;

import java.util.Scanner;

// Write a program to check if a given number is a prime number.

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "";  // Initialize choice with an empty string

        do {
            try {
                // Prompt user to enter a number
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();

                if (number < 0) {
                    throw new IllegalArgumentException("Number must be non-negative");
                }

                // Assume the number is prime
                boolean isPrime = true;

                // Check if the number is less than 2 (not prime)
                if (number < 2) {
                    isPrime = false;
                } else {
                    // Check for factors other than 1 and the number itself
                    for (int i = 2; i <= number / 2; i++) {
                        if (number % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }

                // Print the result
                if (isPrime) {
                    System.out.println(number + " is a prime number.");
                } else {
                    System.out.println(number + " is not a prime number.");
                }

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



