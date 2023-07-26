package main;

import java.util.Scanner;

public class GenerateTranscript {
        Scanner inp = new Scanner(System.in);

        public void takeInputFromUser() {
            System.out.print("Enter Student Id: ");
            int studentId = inp.nextInt();
            inp.nextLine();

            Transcript transcript = new Transcript(studentId);
            System.out.println("You can write endoffile to log out.");

            while (true) {
                System.out.print("Enter the department: ");

                String department = inp.nextLine();

                if (department.equals("endoffile")) {
                    break;
                }

                CourseGrade courseGrade = new CourseGrade(department);
                System.out.print("Enter course code: ");
                int courseCode = inp.nextInt();
                inp.nextLine();


                courseGrade.setCourseCode(courseCode);

                System.out.print("Enter the course credit: ");
                int courseCredit = inp.nextInt();
                courseGrade.setCourseCredit(courseCredit);

                System.out.print("Enter the grade: ");
                double gradeDouble = inp.nextDouble();
                inp.nextLine();
                courseGrade.setGradeTaken(gradeDouble);
                transcript.addCourseTaken(courseGrade);
            }
            System.out.println(transcript);
        }
}
