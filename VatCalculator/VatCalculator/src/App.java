import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        double vatRate;

        // Determine the VAT rate based on the amount
        if (amount > 0 && amount <= 1000) {
            vatRate = 0.18; // 18% VAT rate
        } else {
            vatRate = 0.08; // 8% VAT rate
        }

        // Calculate the VAT amount
        double vatAmount = amount * vatRate;

        // Display the results
        System.out.println("VAT Amount: " + vatAmount);
    }
}
