package main.java.javafx525;

import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "";  // Initialize choice with an empty string

        do {
            try {
                // Prompt user to enter two numbers
                System.out.print("Enter first number: ");
                int num1 = scanner.nextInt();
                if (num1 <= 0) {
                    throw new IllegalArgumentException("First number must be positive");
                }

                System.out.print("Enter second number: ");
                int num2 = scanner.nextInt();
                if (num2 <= 0) {
                    throw new IllegalArgumentException("Second number must be positive");
                }

                // Find the GCD of the two numbers
                int gcd = findGCD(num1, num2);

                // Print the GCD
                System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);

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

    // Method to find the GCD of two numbers using the Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

