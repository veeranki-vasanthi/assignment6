import java.util.Scanner;

public class vowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting input string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the input string to lowercase for easier comparison
        input = input.toLowerCase();

        // Flag to check if any vowel is present
        boolean vowelPresent = false;

        // Counter to count the number of vowels
        int vowelCount = 0;

        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a vowel (a, e, i, o, u)
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelPresent = true; // Set the flag to true
                vowelCount++; // Increment the vowel count
            }
        }

        // Displaying the result
        if (vowelPresent) {
            System.out.println("Vowels are present in the string.");
            System.out.println("Total number of vowels: " + vowelCount);
        } else {
            System.out.println("No vowels are present in the string.");
        }

        scanner.close();
    }
}