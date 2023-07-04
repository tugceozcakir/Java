import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Get the lengths of the triangle's sides from the user
        System.out.print("Enter the length of the first side: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of the second side: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the length of the third side: ");
        double c = scanner.nextDouble();

        // Calculate the area of the triangle
        double u = (a + b + c) / 2;
        double area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        // Print in console
        System.out.println("Triangle area: " + area);
    }
}
