import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi kaç elemanlı olsun?: ");
        int elemanSayisi = input.nextInt();

        int[] fibonacci = new int[elemanSayisi];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < elemanSayisi; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.print(elemanSayisi + " elemanlı fibonacci serisi: ");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
