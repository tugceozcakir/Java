package service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import model.Branch;
import model.Instructor;
import model.Sex;

public class InstructorService {
     /*
     private String name;
     private List<Branch> branchList;
     private int age;
     private Sex sex;
     private BigDecimal salary;
    */

    public Instructor createInstructor(String name, List<String> branchNames, Integer age, Sex sex, BigDecimal salary){
        Instructor instructor = new Instructor();
        instructor.setName(name);
        instructor.setAge(age);
        instructor.setSex(sex);
        instructor.setSalary(salary);

        List<Branch> branches = new ArrayList<>();
        BranchService branchService = new BranchService();
        
        for (String branchName : branchNames) {
            Branch branch = branchService.createBranch(branchName);
            branches.add(branch);
        }
        
        instructor.setBranchList(branches);
        return instructor;
    }
}
