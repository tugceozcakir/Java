import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Size of the array: ");
        int n = input.nextInt();

        double[] arr = new double[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++){
            arr[i] = input.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / arr[i];
        }

        double harmonicMean = n / sum;
        System.out.println("Harmonic Average :" + harmonicMean);
    }
}
