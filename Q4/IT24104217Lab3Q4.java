import java.util.Scanner;

public class IT24104217Lab3Q4 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt(); // Read the number

        // Check if the number is a five-digit number
        if (number < 10000 || number > 99999) {
            System.out.println("Please enter a valid five-digit number.");
        } else {
            // Convert the number to a string to separate digits
            String numberStr = Integer.toString(number);
            
            // Print each digit separated by a space
            for (int i = 0; i < numberStr.length(); i++) {
                System.out.print(numberStr.charAt(i) + " ");
            }
            System.out.println(); // Print a new line at the end
        }

        // Close the scanner
        scanner.close();
    }
}