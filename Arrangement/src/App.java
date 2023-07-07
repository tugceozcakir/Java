import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();

        int[] numbers = {number1, number2, number3};
        Arrays.sort(numbers);

        System.out.println("Sorted from smallest to largest:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
