package main;

import java.util.ArrayList;
import java.util.Locale;

public class Transcript {
    private int studentId;
    private ArrayList<CourseGrade> courseGradeList;
    private double GPA;

    public Transcript(int studentID) {
        setStudentId(studentID);
        //Initialize GPA to 0.0 by default
        setGPA(0.0);
        ArrayList<CourseGrade> courseGrades = new ArrayList<>();
        setCourseGradeList(courseGrades);
    }

    public int getStudentID() {
        return studentId;
    }

    public void setStudentId(int studentID) {
        this.studentId = studentID;
    }

    public ArrayList<CourseGrade> getCourseGradeList() {
        return courseGradeList;
    }

    public void setCourseGradeList(ArrayList<CourseGrade> courseGradeList) {
        this.courseGradeList = courseGradeList;
    }

    public double getGPA() {
        return GPA;
    }

    //GPA should be within the range of 0.0 to 4.0
    public void setGPA(double GPA) {
        if(GPA <= 0.0 || GPA >= 4.0){
            this.GPA = 0.0;
        } else {
            this.GPA = GPA;
        }
    }
    // Add a course grade to the transcript
    public void addCourseTaken(CourseGrade courseGrade){
        if(this.getCourseGradeList() != null){
            this.getCourseGradeList().add(courseGrade);
            //Update GPA when course is added
            double totalGPA = 0;
            for(CourseGrade cGrade : this.getCourseGradeList()) {
                totalGPA += (double) (cGrade.getGradeTaken().getNumericValue()) / getCourseGradeList().size();
                this.setGPA(totalGPA);
            }
        } else{
            System.out.println("Course grade not found. Please try again.");
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Student ID: ").append(this.studentId).append("\n");

        for (CourseGrade courseGrade : this.courseGradeList) {
            result.append("Department: ").append(courseGrade.getCourseDepartment())
                    .append(" Code: ").append(courseGrade.getCourseCode())
                    .append(" Credit: ").append(courseGrade.getCourseCredit())
                    .append(" Grade: ").append(courseGrade.getGradeTaken().stringValue)
                    .append("\n");
        }

        result.append("GPA: ").append(String.format(Locale.US, "%.2f", this.GPA)).append("\n");

        return result.toString();
    }
}
