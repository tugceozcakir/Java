package service;

import model.BankAccount;
import model.DanceCourse;
import model.Lecture;
import model.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DanceCourseService {

    private DanceCourse danceCourse; //Homework

    public DanceCourseService() {
        danceCourse = null; //Homework
    }

    public DanceCourse createDanceCourse(String name, String address, String founder, String taxNumber, String taxOffice, int capacity) {

        DanceCourse danceCourse = new DanceCourse();
        danceCourse.setName(name);
        danceCourse.setAddress(address);
        danceCourse.setFounder(founder);
        danceCourse.setTaxNumber(taxNumber);
        danceCourse.setTaxOffice(taxOffice);
        danceCourse.setCapacity(capacity);
        return danceCourse;
    }


    public void createBankAccountToDanceCourse(DanceCourse danceCourse, BankAccount bankAccount, int capacity) {

        if (danceCourse.getBankAccountList() != null) {
            if (isExistBankAccount(danceCourse, bankAccount)) {
                addAmountToExistBankAccount(danceCourse, bankAccount);
            } else {
                danceCourse.getBankAccountList().add(bankAccount);
            }
        } else {
            List<BankAccount> bankAccountList = new ArrayList<>();
            bankAccountList.add(bankAccount);
            //danceCourse.setBankAccountList(List.of(bankAccount));
        }
    }


    private boolean isExistBankAccount(DanceCourse danceCourse, BankAccount bankAccount) {

        boolean isExist = false;

        for (BankAccount bankAccount1 : danceCourse.getBankAccountList()) {
            if (bankAccount1.getIbanNo().equals(bankAccount.getIbanNo())) {
                isExist = true;
                break;
            }
        }
        return isExist;
    }

    private void addAmountToExistBankAccount(DanceCourse danceCourse, BankAccount bankAccount) {

        for (BankAccount bankAccount1 : danceCourse.getBankAccountList()) {
            if (bankAccount1.getIbanNo().equals(bankAccount.getIbanNo())) {
                bankAccount1.setAmount(bankAccount1.getAmount().add(bankAccount.getAmount()));
                break;
            }
        }
    }


    public void createBankAccountToDanceCourse(DanceCourse danceCourse, List<BankAccount> bankAccountList) {

        if (danceCourse.getBankAccountList() != null) {
            danceCourse.getBankAccountList().addAll(bankAccountList);
        } else {
            danceCourse.setBankAccountList(bankAccountList);
        }

    }

    //Homework
    //Dans okulunun ve dans kursunun kapasitesi.
   public boolean enrollStudentToLecture(Lecture lecture) {
    if (danceCourse == null) {
        System.out.println("Dans okulu oluşturulmadı, dersin kapasitesi kontrol edilemiyor.");
        return false;
    }

    if (lecture.getStudentsEnrolled() == null) {
        lecture.setStudentsEnrolled(new HashSet<>());
    }

    if (lecture.getStudentsEnrolled().size() >= danceCourse.getCapacity()) {
        System.out.println("Dans okulu kapasitesi dolu, öğrenci eklenemiyor.");
        return false;
    }

    // Öğrenci listesine eklemek için bir öğrenci nesnesi oluşturup ekleyin
    Student newStudent = new Student();
    lecture.getStudentsEnrolled().add(newStudent);

    return true;
}


}
