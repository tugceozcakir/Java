import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double heat;

        System.out.print("Havanın kaç derece olduğunu yazınız? ");
        heat = input.nextDouble();

        if (heat > 25) {
            System.out.println("Bu havada yüzme etkinliği yapmak harika olur.");
        } else if( heat > 15) {
            System.out.println("Bu havada piknik yapmak harika olabilir.");
        } else if ( heat > 5) {
            System.out.println("Hava dışarıda bir şeyler yapmak için çok iyi olmayabilir. Sinemaya gitmeyi deneyebilirsin.");
        } else {
            System.out.println("Artık soğuk günlere gelmişiz. Kayak yapmak için harika zamanlar!!");
        }  
    
    }
}
