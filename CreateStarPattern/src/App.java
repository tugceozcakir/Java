public class App {
    public static void main(String[] args) throws Exception {
        int n = 9;
        int k = 0;

        for (int i = 1; i <= n; i++) {
            
            if (i <= (n + 1) / 2) {
                k++;
            } else {
                k--;
            }

            for (int j = 1; j <= (n - k); j++) {
                System.out.print(" ");
            }

            for (int m = 1; m <= ((2 * k) - 1); m++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
