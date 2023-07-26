package main;

import util.Grade;

public class CourseGrade {
    private String courseDepartment;
    private int courseCode;
    private int courseCredit;
    private Grade gradeTaken;

    public CourseGrade(String courseDepartment) {
        //Default values
        this(courseDepartment, 100, 4, Grade.F);
    }

    public CourseGrade(String courseDepartment, int courseCode) {
        //Default values
        this(courseDepartment, courseCode, 4, Grade.F);
    }

    public CourseGrade(String courseDepartment, int courseCode, int courseCredit) {
        //Default values
        this(courseDepartment, courseCode, courseCredit, Grade.F);
    }
    public CourseGrade(String courseDepartment, int courseCode, int courseCredit, Grade gradeTaken) {
        setCourseDepartment(courseDepartment);
        setCourseCode(courseCode);
        setCourseCredit(courseCredit);
        setGradeTaken(gradeTaken);
    }

    public String getCourseDepartment() {
        return courseDepartment;
    }

    public void setCourseDepartment(String courseDepartment) {
        if (courseDepartment.equals("CENG") || courseDepartment.equals("COMP")
                || courseDepartment.equals("ECE") || courseDepartment.equals("ME")
                || courseDepartment.equals("MATH"))
            this.courseDepartment = courseDepartment;
        else
            //Default value if invalid courseDepartment
            this.courseDepartment = "CENG";
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        if (courseCode < 100 || courseCode > 599){
            //Default value if invalid courseCode
            this.courseCode = 100;
        } else{
            this.courseCode = courseCode;
        }
    }

    public double getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        if(courseCredit == 3 || courseCredit == 4){
            this.courseCredit = courseCredit;
        } else {
            //Default value if invalid courseCredit
            this.courseCredit = 4;
        }
    }

    public Grade getGradeTaken() {
        return gradeTaken;
    }

    public void setGradeTaken(Grade g){
        this.gradeTaken = g;
    }
    public void setGradeTaken(double val) {
        double roundedVal = Math.round(val);
        if (roundedVal == 0)
            this.gradeTaken = Grade.F;
        else if (roundedVal == 1)
            this.gradeTaken = Grade.D;
        else if (roundedVal == 2)
            this.gradeTaken = Grade.C;
        else if (roundedVal == 3)
            this.gradeTaken = Grade.B;
        else
            this.gradeTaken = Grade.A;
    }

    @Override
    public String toString() {
        return "Department: " + courseDepartment +
                " CourseCode: " + courseCode + " Credit: " + courseCredit +
                " Grade: " + gradeTaken.name() + "\n";
    }
}
