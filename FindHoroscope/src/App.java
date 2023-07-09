import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the day you were born (as a number): ");
        int month = input.nextInt();

        System.out.print("Enter the month you were born:");
        int day = input.nextInt();

        if(month == 1){
            if (day <= 21){
                System.out.println("Your horoscope: Oğlak");
            } else {
            System.out.println("Your horoscope: Kova");
            }
        } else if(month == 2){
            if (day <= 19){
                System.out.println("Your horoscope: Kova");
            } else {
            System.out.println("Your horoscope: Balık");
            }
        } else if(month == 3){
            if (day <= 20){
                System.out.println("Your horoscope: Balık");
            } else {
            System.out.println("Your horoscope: Koç");
            }
        } else if(month == 4){
            if (day <= 21){
                System.out.println("Your horoscope: Koç");
            } else {
            System.out.println("Your horoscope: Boğa");
            }
        } else if(month == 5){
            if (day <= 19){
                System.out.println("Your horoscope: Boğa");
            } else {
            System.out.println("Your horoscope: İkizler");
            }
        } else if(month == 6){
            if (day <= 22){
                System.out.println("Your horoscope: İkizler");
            } else {
            System.out.println("Your horoscope: Yengeç");
            }
        } else if(month == 7){
            if (day <= 22){
                System.out.println("Your horoscope: Yengeç");
            } else {
            System.out.println("Your horoscope: Aslan");
            }
        } else if(month == 8){
            if (day <= 22){
                System.out.println("Your horoscope: Aslan");
            } else {
            System.out.println("Your horoscope: Başak");
            }
        } else if(month == 9){
            if (day <= 22){
                System.out.println("Your horoscope: Başak");
            } else {
            System.out.println("Your horoscope: Terazi");
            }
        } else if(month == 10){
            if (day <= 22){
                System.out.println("Your horoscope: Terazi");
            } else {
            System.out.println("Your horoscope: Akrep");
            }
        } else if(month == 11){
            if (day <= 21){
                System.out.println("Your horoscope: Akrep");
            } else {
            System.out.println("Your horoscope: Yay");
            }
        } else if(month == 12){
            if (day <= 21){
                System.out.println("Your horoscope: Yay");
            } else {
            System.out.println("Your horoscope: Oğlak");
            }
        } 
    }
}
