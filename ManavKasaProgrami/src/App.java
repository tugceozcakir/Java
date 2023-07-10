import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        double armutKgFiyati = 2.14;
        double elmaKgFiyati = 3.67;
        double domatesKgFiyati = 1.11;
        double muzKgFiyati = 0.95;
        double patlicanKgFiyati = 5.00;

        System.out.print("Armut Kaç Kilo?: ");
        double armutKilo = scanner.nextDouble();
        
        System.out.print("Elma Kaç Kilo?: ");
        double elmaKilo = scanner.nextDouble();
        
        System.out.print("Domates Kaç Kilo?: ");
        double domatesKilo = scanner.nextDouble();
        
        System.out.print("Muz Kaç Kilo?: ");
        double muzKilo = scanner.nextDouble();
        
        System.out.print("Patlıcan Kaç Kilo?: ");
        double patlicanKilo = scanner.nextDouble();
        
        double toplamTutar = (armutKgFiyati * armutKilo) + (elmaKgFiyati * elmaKilo) +
                             (domatesKgFiyati * domatesKilo) + (muzKgFiyati * muzKilo) +
                             (patlicanKgFiyati * patlicanKilo);
        
        System.out.println("Toplam Tutar : " + toplamTutar + " TL");
    }
}
