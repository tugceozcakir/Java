import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double harmonicSum = 0;

        for (int i = 1; i <= number; i++) {
            harmonicSum += 1.0 / i;
        }

        System.out.println("Harmonic series sum: " + harmonicSum);
    }
}
