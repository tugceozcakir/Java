import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("---- Powers of four ----- ");
        for (int i=1; i < number; i *= 4) {
            System.out.println(i);
        }

        System.out.println("---- Powers of five ----");
        for (int j=1; j < number; j *= 5) {
            System.out.println(j);
        }
    }
}
