package main.java.javafx525;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "";  // Initialize choice with an empty string

        do {
            try {
                // Prompt user to enter the size of the array
                System.out.print("Enter the size of the array: ");
                int size = scanner.nextInt();

                if (size <= 0) {
                    throw new IllegalArgumentException("Size must be positive");
                }

                // Initialize the array
                int[] array = new int[size];

                // Prompt user to enter elements of the array
                System.out.println("Enter the elements of the array:");
                for (int i = 0; i < size; i++) {
                    array[i] = scanner.nextInt();
                }

                // Reverse the array
                reverseArray(array);

                // Print the reversed array
                System.out.println("Reversed array: " + Arrays.toString(array));

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

    // Method to reverse the array
    public static void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            // Swap elements at left and right indices
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}


