package main.java.javafx525;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "";  // Initialize choice with an empty string

        do {
            try {
                // Prompt user to enter a string
                System.out.print("Enter a string: ");
                String input = scanner.nextLine();

                if (input.isEmpty()) {
                    throw new IllegalArgumentException("Input cannot be empty");
                }

                // Reverse the string
                String reversed = new StringBuilder(input).reverse().toString();

                // Check if the original string is equal to the reversed string
                if (input.equalsIgnoreCase(reversed)) {
                    System.out.println(input + " is a palindrome.");
                } else {
                    System.out.println(input + " is not a palindrome.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
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




