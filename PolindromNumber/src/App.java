import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = input.nextInt();

        if (isPalindrom(number)) {
            System.out.println(number + " palindrom bir sayıdır.");
        } else {
            System.out.println(number + " palindrom bir sayı değildir.");
        }
    }

    public static boolean isPalindrom(int number) {
        int originalNumber = number;
        int reverse = 0;

        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }

        return originalNumber == reverse;
    }
}
