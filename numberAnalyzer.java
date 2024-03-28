import java.util.Scanner;

public class numberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables for largest, smallest, sum, and count
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        // Flag to determine if the user wants to continue entering numbers
        boolean continueEntering = true;

        // Loop to enter numbers
        while (continueEntering) {
            // Accepting number input from the user
            System.out.print("Enter a number (enter any non-numeric value to finish): ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                // Update largest and smallest numbers
                largest = Math.max(largest, number);
                smallest = Math.min(smallest, number);

                // Update sum and count
                sum += number;
                count++;
            } else {
                // If non-numeric input is received, exit the loop
                continueEntering = false;
            }

            // Consume newline character
            scanner.nextLine();
        }

        // Checking if any numbers were entered
        if (count > 0) {
            // Calculate average
            double average = (double) sum / count;

            // Display results
            System.out.println("Largest number entered: " + largest);
            System.out.println("Smallest number entered: " + smallest);
            System.out.println("Average of all numbers entered: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}