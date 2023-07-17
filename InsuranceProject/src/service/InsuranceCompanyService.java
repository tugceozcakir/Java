package service;

import model.*;

import java.math.BigDecimal;
import java.util.ArrayList;

public class InsuranceCompanyService {


    public InsuranceCompany createInsuranceCompany(String name, String taxNumber, String taxOffice,
                                                   String address, BigDecimal commision){
        InsuranceCompany insuranceCompany = new InsuranceCompany();
        insuranceCompany.setName(name);
        insuranceCompany.setTaxNumber(taxNumber);
        insuranceCompany.setTaxOffice(taxOffice);
        insuranceCompany.setAddress(address);
        insuranceCompany.setCommision(commision);

        return  insuranceCompany;
    }
    public void addInsuranceToInsuranceCompany(Insurance insurance, InsuranceCompany insuranceCompany){
        if(insuranceCompany.getInsuranceList() != null){
            insuranceCompany.getInsuranceList().add(insurance);
        } else {
            ArrayList<Insurance> insuranceList = new ArrayList<>();
            insuranceList.add(insurance);
            insuranceCompany.setInsuranceList(insuranceList);
        }
    }
    public void addBankAccountToInsuranceCompany(BankAccount bankAccount, InsuranceCompany insuranceCompany){
        if(insuranceCompany.getBankAccountList() != null){
            insuranceCompany.getBankAccountList().add(bankAccount);
        } else {
            ArrayList<BankAccount> bankAccountList = new ArrayList<>();
            bankAccountList.add(bankAccount);
            insuranceCompany.setBankAccountList(bankAccountList);
        }
    }
    public void addPaymentMovementToInsuranceCompany(PaymentMovement paymentMovement, InsuranceCompany insuranceCompany){
        if(insuranceCompany.getPaymentMovementList() != null){
            insuranceCompany.getPaymentMovementList().add(paymentMovement);
        } else {
            ArrayList<PaymentMovement> paymentMovementList = new ArrayList<>();
            paymentMovementList.add(paymentMovement);
            insuranceCompany.setPaymentMovementList(paymentMovementList);
        }
    }

}
