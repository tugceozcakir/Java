import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber, secondNumber, select, result;
        
        System.out.print("Enter the first number: ");
        firstNumber = input.nextInt();
        System.out.print("Enter the second number: ");
        secondNumber = input.nextInt();
        
        System.out.println("1: Addition \n 2: Subtraction \n 3: Multiplication \n 4: Division ");
        System.out.print("Your choice: ");

        select = input.nextInt();

        switch(select){
            case 1:
                result = firstNumber + secondNumber;
                System.out.print("Result: " + result);
                break;
                case 2:
                result = firstNumber - secondNumber;
                System.out.print("Result: " + result);
                break;
                case 3:
                result = firstNumber * secondNumber;
                System.out.print("Result: " + result);
                break;
                case 4:
                result = firstNumber / secondNumber;
                System.out.print("Result: " + result);
                break;
            default:
                System.out.println("You need to specify a number in the sequence for the operation.");
                break;
        }

    }
}
