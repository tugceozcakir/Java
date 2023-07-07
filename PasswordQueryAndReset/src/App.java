import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner input = new Scanner(System.in);
        System.out.print("Create your username: ");
        String correctUsername = input.nextLine();

        System.out.print("Create your password: ");
        String correctPassword = input.nextLine();

        System.out.print("Enter your password: ");
        String enteredPassword = input.nextLine();

        if (!enteredPassword.equals(correctPassword)) {
            System.out.print("Incorrect password. Reset password? (yes/no): ");
            String resetOption = input.nextLine();

            if (resetOption.equalsIgnoreCase("yes")) {
                System.out.print("Enter a new password: ");
                String newPassword = input.nextLine();

                if (!newPassword.equals(enteredPassword) && !newPassword.equals(correctPassword)) {
                    System.out.println("Password created successfully.");
                    correctPassword = newPassword;
                } else {
                    System.out.println("Password could not be created. Please enter a different password.");
                }
            } else {
                System.out.println("Password reset canceled.");
            }
        } else {
            System.out.println("Password is correct. Access granted.");
        }
    }
}
