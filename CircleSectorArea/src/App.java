import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double pi = 3.14;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r = scanner.nextDouble();
        System.out.print("Enter the central angle in degrees: ");
        double alpha = scanner.nextDouble();
        scanner.close();

        double area = (pi * (r * r) * alpha) / 360;

        System.out.println("The area of the circular sector is: " + area);
    }
}
