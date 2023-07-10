import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your height (in meters): ");
        double height = input.nextDouble();

        System.out.print("Please enter your weight: ");
        double weight = input.nextDouble();

        double bodyMassIndex = weight / (height * height);
        
        System.out.println("Your Body Mass Index: " + bodyMassIndex);
    }
}
