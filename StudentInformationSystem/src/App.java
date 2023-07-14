import model.Course;
import model.Student;
import model.Teacher;

public class App {
    public static void main(String[] args) throws Exception {
        Teacher t1 = new Teacher("Ayşe Keskin", "TRH", "0511 111 11 11");
        Teacher t2 = new Teacher("Fatma Dağ", "FZK", "0511 111 11 12");
        Teacher t3 = new Teacher("Rumeysa Sarıgül", "BIO", "0511 111 511 13");

        Course tarih = new Course ("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course ("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course ("Biyoloji", "103", "BIO");
        biyoloji.addTeacher(t3);

        Student s1 = new Student("Feyza Orbay", "124", "4", tarih, fizik, biyoloji);
        s1.addBulkExamNote(50,30,70);
        s1.addBulkQuizNote(70, 50, 80);
        s1.NoteAverage(50,30,70,70, 50, 80);
        s1.isPass();

    }
}
