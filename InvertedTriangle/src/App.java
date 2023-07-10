import java.util.Scanner;

public class App {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of digits: ");
        int digit = input.nextInt();
        
        for (int i = digit; i >= 1; i--) {
            for (int j = (digit - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = ((2 * i) - 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
