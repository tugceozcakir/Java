package service;

import java.util.List;

import model.BankAccount;
import model.DanceCourse;
import model.Instructor;
import model.PaymentMovement;

public class DanceCourseService {
     /*
     private String name;
     private String address;
     private String founder;
     private String taxNumber;
     private String taxOffice;
     private List<BankAccount> bankAccountList;
     private List<PaymentMovement> paymentMovementList;
     private List<Instructor> instructorList;
     */
     public DanceCourse createDanceCourse(String name, String address, String founder, String taxNumber,
     String taxOffice, List<BankAccount> bankAccountList, List<PaymentMovement> paymentMovementList, 
     List<Instructor> instructorList){
          DanceCourse danceCourse = new DanceCourse();
          danceCourse.setName(name);;
          danceCourse.setAddress(address);
          danceCourse.setFounder(founder);
          danceCourse.setTaxNumber(taxNumber);
          danceCourse.setTaxOffice(taxOffice);
          danceCourse.setBankAccountList(bankAccountList);
          danceCourse.setPaymentMovementList(paymentMovementList);
          danceCourse.setInstructorList(instructorList);
          return danceCourse;

     }
}
