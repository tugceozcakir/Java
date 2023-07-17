import model.BankAccount;
import model.Branch;
import model.DanceCourse;
import model.Lecture;
import model.Sex;
import model.Student;
import service.BankAccountService;
import service.BranchService;
import service.DanceCourseService;
import service.InitialDataService;
import service.LectureService;
import service.StudentService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;


public class App {


    public static void main(String[] args) throws Exception {


        DanceCourseService danceCourseService = new DanceCourseService();
        BankAccountService bankAccountService = new BankAccountService();
        LectureService lectureService = new LectureService();
        BranchService branchService = new BranchService();
        StudentService studentService = new StudentService();

        List<Branch> branchList = InitialDataService.loadInitialDataForBranch();

        System.out.println(branchList);


        DanceCourse danceCourse = danceCourseService.createDanceCourse("Özçakır Dance School", "Eskişehir",
                "Tuğçe Özçakır", "98728998789", "Eskişehir", 50);

        System.out.println(danceCourse.toString());

        BankAccount bankAccount = bankAccountService.createBankAccount("T.C. ZİRAAT BANKASI",
                "ÖZÇAKIR LİMİTED ŞİRKETİ", "TR1200002902343", new BigDecimal(100000));

        danceCourseService.createBankAccountToDanceCourse(danceCourse, bankAccount, 50);
        System.out.println(danceCourse);

        BankAccount bankAccount1 = bankAccountService.createBankAccount("T.C. ZİRAAT BANKASI",
                "ÖZÇAKIR LİMİTED ŞİRKETİ", "TR1200002902343", new BigDecimal(200000));


        danceCourseService.createBankAccountToDanceCourse(danceCourse, bankAccount1, 50);
        System.out.println(danceCourse);

        branchService.createBranchToBranchPool(branchList, "Bachata");
        System.out.println(branchList);

        //Homework
        Branch branchForLecture = branchList.get(0);
        Lecture newLecture = lectureService.createLecture("Bachata for Beginners", branchForLecture, 2);
        System.out.println("Yeni ders eklendi: " + newLecture.getName() + " - " + newLecture.getBranch().getName());


        LocalDate startDate = LocalDate.of(2023, 7, 1);
        LocalDate endDate = LocalDate.of(2023, 8, 1);

        Student student1 = studentService.createStudent("Egemen Kaya", 32, Sex.MALE, false, new BigDecimal(10000),
                java.sql.Date.valueOf(startDate), java.sql.Date.valueOf(endDate));

        System.out.println(student1.toString());
        
        Student student2 = studentService.createStudent("Anıl Çalışkan", 32, Sex.MALE, false, new BigDecimal(10000),
                java.sql.Date.valueOf(startDate), java.sql.Date.valueOf(endDate));
        Student student3 = studentService.createStudent("Ayşe Dağ", 32, Sex.MALE, false, new BigDecimal(10000),
                java.sql.Date.valueOf(startDate), java.sql.Date.valueOf(endDate));
        Student student4 = studentService.createStudent("Ezgi Ermiş", 32, Sex.MALE, false, new BigDecimal(10000),
                java.sql.Date.valueOf(startDate), java.sql.Date.valueOf(endDate));

        List<Student> students = Arrays.asList(student1, student2, student3, student4);
        
        for (Student student : students) {
            lectureService.enrollStudentToLecture(newLecture, student);
        }
    }

}