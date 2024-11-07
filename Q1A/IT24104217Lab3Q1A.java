import java.util.Scanner;

public class IT24104217Lab3Q1A {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble(); 

        
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantityKg = scanner.nextDouble();

        
        double totalAmount = pricePerKg * quantityKg;

        
        System.out.printf("The total amount you have to pay: %.2f%n", totalAmount);

      
        scanner.close();
    }
}