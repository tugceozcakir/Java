package model;

import java.math.BigDecimal;
import java.util.ArrayList;

public class InsuranceCompany {
    private String name;

    private String taxNumber;

    private String taxOffice;

    private String address;

    private BigDecimal commision;
    private  ArrayList<Insurance> insuranceList;

    private ArrayList<BankAccount> bankAccountList;

    private ArrayList<PaymentMovement> paymentMovementList;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getTaxOffice() {
        return taxOffice;
    }

    public void setTaxOffice(String taxOffice) {
        this.taxOffice = taxOffice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getCommision() {
        return commision;
    }

    public void setCommision(BigDecimal commision) {
        this.commision = commision;
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(ArrayList<Insurance> insuranceList) {
        this.insuranceList = insuranceList;
    }

    public ArrayList<BankAccount> getBankAccountList() {
        return bankAccountList;
    }

    public void setBankAccountList(ArrayList<BankAccount> bankAccountList) {
        this.bankAccountList = bankAccountList;
    }

    public ArrayList<PaymentMovement> getPaymentMovementList() {
        return paymentMovementList;
    }

    public void setPaymentMovementList(ArrayList<PaymentMovement> paymentMovementList) {
        this.paymentMovementList = paymentMovementList;
    }

    @Override
    public String toString() {
        return "model.InsuranceCompany{" +
                "name='" + name + '\'' +
                ", taxNumber='" + taxNumber + '\'' +
                ", taxOffice='" + taxOffice + '\'' +
                ", address='" + address + '\'' +
                ", commision=" + commision +
                ", insuranceList=" + insuranceList +
                ", bankAccountList=" + bankAccountList +
                ", paymentMovementList=" + paymentMovementList +
                '}';
    }
}
