package main;

import util.Grade;

import java.io.*;
import java.util.Scanner;

public class GenerateTranscript {
        static Scanner input = new Scanner(System.in);

        public void takeInputFromUser() {
            System.out.print("Enter Student Id: ");
            int studentId = input.nextInt();
            input.nextLine();

            Transcript transcript = new Transcript(studentId);
            System.out.println("You can write endoffile to log out.");

            while (true) {
                System.out.print("Enter the department: ");

                String department = input.nextLine();

                if (department.equals("endoffile")) {
                    break;
                }

                CourseGrade courseGrade = new CourseGrade(department);
                System.out.print("Enter course code: ");
                int courseCode = input.nextInt();
                input.nextLine();


                courseGrade.setCourseCode(courseCode);

                System.out.print("Enter the course credit: ");
                int courseCredit = input.nextInt();
                courseGrade.setCourseCredit(courseCredit);

                System.out.print("Enter the grade: ");
                double gradeDouble = input.nextDouble();
                input.nextLine();

                courseGrade.setGradeTaken(gradeDouble);
                transcript.addCourseTaken(courseGrade);
            }
            System.out.println(transcript);
        }
    public static void takeInputFromFile() {

        System.out.print("Enter filename: ");
        String fileName = "/Users/tugceozcakir/Desktop/Java/hw3/" + input.nextLine().trim();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            int studentID = Integer.parseInt(fileScanner.nextLine().trim());
            Transcript transcript = new Transcript(studentID);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] courseInfo = line.split(" ");
                String department = courseInfo[0];
                int courseCode = Integer.parseInt(courseInfo[1]);
                int courseCredit = Integer.parseInt(courseInfo[2]);
                double gradeValue = Double.parseDouble(courseInfo[3]);

                CourseGrade courseGrade = new CourseGrade(department, courseCode, courseCredit);
                courseGrade.setGradeTaken(gradeValue);
                transcript.addCourseTaken(courseGrade);
            }

            fileScanner.close();
            System.out.println(transcript);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (NumberFormatException e) {
            System.out.println("Error reading file. Invalid format.");
        }
    }

}
