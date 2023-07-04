import java.util.Scanner;

public class App {
    public static void main(String[] args) {
     //Math, Physics, Chemistry, Turkish, History, Music
     Scanner input = new Scanner(System.in);
     int math, physics, chemistry, turkish, history, music;

     System.out.println("Enter your math grade: ");
     math = input.nextInt();

     System.out.println("Enter your physics grade: ");
     physics = input.nextInt();
     
     System.out.println("Enter your chemistry grade: ");
     chemistry = input.nextInt();

     System.out.println("Enter your turkish grade: ");
     turkish = input.nextInt();

     System.out.println("Enter your history grade: ");
     history = input.nextInt();

     System.out.println("Enter your music grade: ");
     music = input.nextInt();

    int result = math + physics + chemistry + turkish + history + music;
    double average = (double) result / 6;

    System.out.println("Average: " + average);

    if (average > 60) {
        System.out.println("Passed the class.");
    } else {
        System.out.println("Failed in class.");
    }
}
}