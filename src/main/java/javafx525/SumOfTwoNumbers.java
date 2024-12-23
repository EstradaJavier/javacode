package main.java.javafx525;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "";  // Initialize choice with an empty string

        do {
            try {
                // Prompt user to enter first number
                System.out.print("Enter first number: ");
                int num1 = scanner.nextInt();

                // Prompt user to enter second number
                System.out.print("Enter second number: ");
                int num2 = scanner.nextInt();

                // Calculate the sum of the two numbers
                int sum = num1 + num2;

                // Print the sum
                System.out.println("The sum is: " + sum);

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

