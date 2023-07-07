import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

        System.out.println("----- Girdiğiniz sayıya kadar çift ve 4'ün katı olan sayıların toplamı -----");
        System.out.print("Çift bir sayı giriniz (Eğer tek bir sayı girerseniz daha fazla sizden bir sayı istemeyeceğiz): ");

        int number = scanner.nextInt();
        int toplam = 0;

        while (number % 2 == 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0 && i % 4 == 0) {
                    toplam += i;
                }
            }

            System.out.print("Devam etmek için bir çift sayı girin veya tek bir sayı girip çıkın. ");
            number = scanner.nextInt();

            if (number % 2 != 0) {
                break;
            }
        }

        if (toplam == 0) {
            System.out.println("Girilen sayılar arasında çift ve 4'ün katı olan sayı yok.");
        } else {
            System.out.println("Çift olan ve 4'e bölünebilen sayıların toplamı: " + toplam);
        }
    }
}
