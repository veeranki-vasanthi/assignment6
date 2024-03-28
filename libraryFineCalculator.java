import java.util.Scanner;

public class libraryFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting the number of days late
        System.out.print("Enter the number of days the book is late: ");
        int daysLate = scanner.nextInt();

        // Calculating the fine
        double fine = 0;

        if (daysLate <= 7) {
            fine = daysLate * 0.5;
        } else if (daysLate >= 8 && daysLate <= 14) {
            fine = (7 * 0.5) + ((daysLate - 7) * 1);
        } else if (daysLate > 14 && daysLate <= 21) {
            fine = (7 * 0.5) + (7 * 1) + ((daysLate - 14) * 5);
        } else {
            System.out.println("Your membership is canceled for returning the book after 21 days.");
            scanner.close();
            return;
        }

        System.out.println("The fine for returning the book " + daysLate + " days late is: Rs. " + fine);

        scanner.close();
    }
}