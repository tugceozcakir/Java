package util;

public class GradeTest {
    public static void main() {
        // The toString() method is called for each Grade enum.
        for(Grade grade : Grade.values()){
            System.out.println(grade.toString());
        }
    }
}
