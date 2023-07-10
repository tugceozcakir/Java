import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi giriniz (KM cinsinden): ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk Tipini Seçin (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int tip = scanner.nextInt();

        double birimFiyat = 0.10; //KM'ye göre ücret
        double tamUcret = mesafe * birimFiyat;
        double indirimliUcret = tamUcret;

        //Kullanıcı negatif bir değer giremesin.
        //Kullanıcınin yolculuk tipi tek yön, gidiş dönüşten farklı bir değer olmasın.
        if (mesafe < 0 || yas < 0 || (tip != 1 && tip != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }

        //Yaş indirimi
        if (yas < 12) {
            indirimliUcret -= tamUcret * 0.50;
        } else if (yas >= 12 && yas <= 24) {
            indirimliUcret -= tamUcret * 0.10;
        } else if (yas >= 65) {
            indirimliUcret -= tamUcret * 0.30;
        }

        //Yolculuk tipine göre indirim hesabı
        if (tip == 2) {
            indirimliUcret -= indirimliUcret * 0.20;
        }

        //Toplam ücret
        double toplamUcret = tip == 2 ? indirimliUcret * 2 : indirimliUcret;

        System.out.println("Toplam Ücret: " + toplamUcret + " TL");
    }
}
