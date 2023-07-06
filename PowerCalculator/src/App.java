import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        //Ask for the base
        System.out.print("Enter the base: ");
        int base = scanner.nextInt();

        //Ask for the power
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= base;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
