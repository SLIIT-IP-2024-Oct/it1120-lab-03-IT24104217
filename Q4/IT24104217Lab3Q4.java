import java.util.Scanner;

public class IT24104217Lab3Q4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt(); 

        
        if (number < 10000 || number > 99999) {
            System.out.println("Please enter a valid five-digit number.");
        } else {
            
            String numberStr = Integer.toString(number);
            
            
            for (int i = 0; i < numberStr.length(); i++) {
                System.out.print(numberStr.charAt(i) + " ");
            }
            System.out.println(); 
        }

        
        scanner.close();
    }
}
