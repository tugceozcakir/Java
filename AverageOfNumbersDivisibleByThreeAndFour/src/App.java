import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int total = 0; //Variable to hold the total
        int count = 0; //Variable to hold the number of divisible numbers
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

    for (int i = 0; i <= number; i++) {
        if (i % 3 == 0 && i % 4 == 0) {
            total += i;
            count++;
        }
    }

    int average = 0;
    if (count != 0) {
        average = total / count;
    }

    System.out.println("3'e ve 4'e bölünebilen sayıların ortalaması: " + average);
    }
}
