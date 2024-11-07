import java.util.Scanner;

public class IT24104217Lab3Q3 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the rupee amount
        System.out.print("Enter the amount in rupees: ");
        int amount = scanner.nextInt(); // Read the amount

        // Denominations available
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        // Array to hold the count of each denomination
        int[] count = new int[denominations.length];

        // Calculate the number of notes/coins for each denomination
        for (int i = 0; i < denominations.length; i++) {
            if (amount >= denominations[i]) {
                count[i] = amount / denominations[i]; // Get the count of this denomination
                amount = amount % denominations[i]; // Update the remaining amount
            }
        }

        // Display the results
        System.out.println("Denominations of the entered amount:");
        for (int i = 0; i < denominations.length; i++) {
            if (count[i] > 0) {
                System.out.printf("%d x %d/-\n", count[i], denominations[i]);
            }
        }

        // Close the scanner
        scanner.close();
    }
}