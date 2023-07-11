import java.math.BigDecimal;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import model.BankAccount;
import model.Branch;
import model.DanceCourse;
import model.Day;
import model.Instructor;
import model.Lecture;
import model.LectureScheduleTime;
import model.MovementType;
import model.PaymentMovement;
import model.Sex;
import model.Student;
import service.BankAccountService;
import service.BranchService;
import service.DanceCourseService;
import service.InstructorService;
import service.LectureScheduleTimeService;
import service.LectureService;
import service.PaymentMovementService;
import service.StudentService;

public class App {
    public static void main(String[] args) throws Exception {
        BankAccountService bankAccountService = new BankAccountService();
        BranchService branchService = new BranchService();
        InstructorService instructorService = new InstructorService();
        LectureScheduleTimeService lectureScheduleTimeService = new LectureScheduleTimeService();
        PaymentMovementService paymentMovementService = new PaymentMovementService();
        StudentService studentService = new StudentService();
        LectureService lectureService = new LectureService();
        DanceCourseService danceCourseService = new DanceCourseService();

        //Create Bank Account
        BigDecimal initialAccount = new BigDecimal("300000.00");
        BankAccount bankAccount = bankAccountService.createBankAccount("Yapı Kredi Bankası", "1234567", "Özçakır Dance School", initialAccount);
        System.out.println(bankAccount.toString());

        //Create Branch
        Branch branch = branchService.createBranch("Salsa");
        System.out.println(branch.toString());
        
        //Create Instructor
        List<String> branchNames = new ArrayList<>();
        branchNames.add(branch.getName());

        BigDecimal salary = BigDecimal.valueOf(10000);

        Instructor instructor = instructorService.createInstructor("Tuğçe Özçakır", branchNames, 24, Sex.FEMALE, salary);
        System.out.println(instructor.toString());

        //Create Lecture Schedule Time
        LectureScheduleTime lectureScheduleTime = lectureScheduleTimeService.createLectureScheduleTime(Day.FRIDAY, "21:30");
        System.out.println(lectureScheduleTime.toString());

        //Create Payment Movement
        PaymentMovement paymentMovement = paymentMovementService.createPaymentMovement(bankAccount, "Payment description", MovementType.INCOME, initialAccount);
        System.out.println(paymentMovement.toString());

        //Create Student
        BigDecimal contractAmount = new BigDecimal("500.00");
        Date startDate = new Date();
        Date endDate = new Date();
        
        Student student = studentService.createStudent("Egemen Kaya", 30, Sex.MALE, false, contractAmount, startDate, endDate);
        System.out.println(student.toString());

        //Create Lecture
        List<LectureScheduleTime> scheduleTimeList = new ArrayList<>();
        scheduleTimeList.add(lectureScheduleTime);
        
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);

        Lecture lecture = lectureService.createLecture("Salsa", instructor, branch, 20, scheduleTimeList, studentList);
        System.out.println(lecture.toString());

        //Create Dance Course
        List<BankAccount> bankAccountList = new ArrayList<>();
        bankAccountList.add(bankAccount);

        List<PaymentMovement> paymentMovementList = new ArrayList<>();
        paymentMovementList.add(paymentMovement);

        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(instructor);

        DanceCourse danceCourse = danceCourseService.createDanceCourse("Özçakır Dance School", "Eskişehir Tepebaşı/Yenibağlar", "Feyza Çelik Orbay",
         "192848274", "TaxOffice", bankAccountList, paymentMovementList, instructorList);
        System.out.println(danceCourse.toString());
    }
}
