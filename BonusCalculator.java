import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for current year and year of joining
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();
        System.out.print("Enter the year of joining: ");
        int joiningYear = scanner.nextInt();

        // Calculating years of service
        int yearsOfService = currentYear - joiningYear;

        // Checking eligibility for bonus
        if (yearsOfService > 5) {
            System.out.println("Congratulations! You have ser2024ved for more than 5 years. You are eligible for a bonus of Rs. 5000/-");
        } else if (yearsOfService >= 3 && yearsOfService <= 5) {
            System.out.println("Congratulations! You have served for " + yearsOfService + " years. You are eligible for a bonus of Rs. 3000/-");
        } else {
            System.out.println("Sorry, you are not eligible for a bonus. Keep up the good work!");
        }

        scanner.close();
    }
}