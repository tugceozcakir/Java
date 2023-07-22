import main.CourseGrade;
import main.Transcript;
import util.Grade;
import util.GradeTest;

public class Main {
    public static void main(String[] args) {
        //GradeTest.main();
        CourseGrade courseGrade1 = new CourseGrade("CENG", 201, 4, Grade.C);
        CourseGrade courseGrade2 = new CourseGrade("CENG", 201, 4, Grade.A);
        CourseGrade courseGrade3 = new CourseGrade("CENG", 201, 4, Grade.C);
        CourseGrade courseGrade4 = new CourseGrade("CENG", 201, 4, Grade.A);
        CourseGrade courseGrade5 = new CourseGrade("CENG", 201, 4, Grade.B);

        Transcript transcript = new Transcript(1112234);
        transcript.addCourseTaken(courseGrade1);
        transcript.addCourseTaken(courseGrade2);
        transcript.addCourseTaken(courseGrade3);
        transcript.addCourseTaken(courseGrade4);
        transcript.addCourseTaken(courseGrade5);

        System.out.print(transcript);
    }
}