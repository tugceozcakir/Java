import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int n = input.nextInt();
        recursiveMetot(n);
    }

    public static void recursiveMetot(int n) {
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }  
        System.out.print(n + " ");
        recursiveMetot(n - 5);
        System.out.print(n + " ");
    }
}
