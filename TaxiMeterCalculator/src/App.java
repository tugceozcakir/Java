import java.util.Scanner;

public class App {
    public static void main(String[] args) {
         //Get the distance from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance traveled (in KM): ");
        double distance = scanner.nextDouble();

        double initialFare = 10.0;
        double perKilometerRate = 2.20;
        double totalFare = initialFare + (distance * perKilometerRate);
        
        // Minimum payment check
        if (totalFare < 20.0) {
            totalFare = 20.0;
        }

        // Display the taxi fare
        System.out.println("Taxi fare: " + totalFare + " TL");
    }
}
