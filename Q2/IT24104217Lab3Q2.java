import java.util.Scanner;

public class IT24104217Lab3Q2 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the monthly salary
        System.out.print("Enter the monthly salary: ");
        double monthlySalary = scanner.nextDouble(); // Read the monthly salary

        // Prompt the user to enter the number of OT hours
        System.out.print("Enter the number of OT hours: ");
        double otHours = scanner.nextDouble(); // Read the OT hours

        // Prompt the user to enter the OT hourly rate
        System.out.print("Enter the OT hourly rate: ");
        double otHourlyRate = scanner.nextDouble(); // Read the OT hourly rate

        // Calculate the OT Amount
        double otAmount = otHours * otHourlyRate;

        // Calculate the Total Salary
        double totalSalary = monthlySalary + otAmount;

        // Display the results
        System.out.printf("OT Amount: %.2f%n", otAmount);
        System.out.printf("Total Salary: %.2f%n", totalSalary);

        // Close the scanner
        scanner.close();
    }
}