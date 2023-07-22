package util;

public class GradeTest {
    public static void main() {
        //Call toString for each Grade enum
        for(Grade grade : Grade.values()){
            System.out.println(grade.toString());
        }
    }
}
