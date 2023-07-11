import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //QUESTION 1 : Matris boyutunu sizin belirlediğiniz matris değerlerini ise kullanıcının girdiği bir algoritma yazınız.
        //ANSWER 1
        /*
        int matrix[][] = new int[3][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and "
                + matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        */

    //QUESTION 2 : İstediğiniz boyutta matris oluşturarak matris değerlerine 0-99 arası random sayılar üreterek matrise atama yapınız.
    //ANSWER 2
    /* 
    int[][] matrix = new int[3][4];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }
    */

    //QUESTION 3 : Aşağıdaki kod bloğunun çıktısı nedir?
    /* int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        } 
    */
    //ANSWER 3 : 6 5 / 4 3 / 2 1  

    }
}
