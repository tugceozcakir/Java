import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int target = input.nextInt();

        int[] numbers = {10, 12758, 788, 1, -1, -778, 2, 0};

        int closestSmaller = Integer.MIN_VALUE;
        int closestLarger = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < target && number > closestSmaller) {
                closestSmaller = number;
            }
            if (number > target && number < closestLarger) {
                closestLarger = number;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);
    }
}

