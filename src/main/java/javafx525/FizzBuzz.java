import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToRun = 0;
        boolean runAgain;

        do {
            while (true) {
                System.out.print("What number would you like to go up to? : ");
                try {
                    numberToRun = Integer.parseInt(scanner.nextLine());
                    if (numberToRun <= 0) {
                        throw new NumberFormatException("Number must be positive.");
                    }
                    break; // Exit the loop if the input is valid
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a positive integer.");
                }
            }

            for (int i = 1; i <= numberToRun; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }

            while (true) {
                System.out.print("Would you like to run again?: ");
                String response = scanner.nextLine().trim().toLowerCase();
                if (response.equals("yes") || response.equals("y")) {
                    runAgain = true;
                    break;
                } else if (response.equals("no") || response.equals("n")) {
                    runAgain = false;
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 'yes', 'no', 'y', or 'n'.");
                }
            }
        } while (runAgain);

        System.out.println("Thank you for using FizzBuzz!");
    }
}
