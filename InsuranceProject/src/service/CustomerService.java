package service;

import model.*;

import java.util.ArrayList;

public class CustomerService {


    public Customer createCustomer(String name, CustomerTypeEnum customerTypeEnum){
        Customer customer = new Customer();
        customer.setName(name);
        customer.setCustomerTypeEnum(customerTypeEnum);
        return customer;
    }

    public  void addBankAccountToCustomer(BankAccount bankAccount, Customer customer){
        if(customer.getBankAccountList() != null){
            customer.getBankAccountList().add(bankAccount);
        } else {
            ArrayList<BankAccount> bankAccounts = new ArrayList<>();
            bankAccounts.add(bankAccount);
            customer.setBankAccountList(bankAccounts);
        }
    }
    public void addInsuranceRequestToCustomer(Customer customer, InsuranceRequest insuranceRequest){
        if(customer.getInsuranceRequestList() != null){
            customer.getInsuranceRequestList().add(insuranceRequest);
        } else {
            ArrayList<InsuranceRequest> insuranceRequestList = new ArrayList<>();
            insuranceRequestList.add(insuranceRequest);
            customer.setInsuranceRequestList(insuranceRequestList);
        }
    }
    public void addPolicyToCustomer(Policy policy, Customer customer){
        if(customer.getPolicyList() != null) {
            customer.getPolicyList().add(policy);
        } else {
            ArrayList<Policy> policyList = new ArrayList<>();
            policyList.add(policy);
            customer.setPolicyList(policyList);
        }
    }
    public void addPaymentMovementToCustomer(PaymentMovement paymentMovement, Customer customer){
        if(customer.getPaymentMovementList() != null){
            customer.getPaymentMovementList().add(paymentMovement);
        } else {
            ArrayList<PaymentMovement> paymentMovementList = new ArrayList<>();
            paymentMovementList.add(paymentMovement);
            customer.setPaymentMovementList(paymentMovementList);
        }
    }
    public void addVehicleToCustomer(Vehicle vehicle, Customer customer){
        if(customer.getVehicleList() != null){
            customer.getVehicleList().add(vehicle);
        } else {
            ArrayList<Vehicle> vehicleList = new ArrayList<>();
            vehicleList.add(vehicle);
            customer.setVehicleList(vehicleList);
        }
    }
}
