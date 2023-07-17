import model.*;
import service.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        AgencyService agencyService = new AgencyService();
        BankAccountService bankAccountService = new BankAccountService();
        InsuranceCompanyService insuranceCompanyService = new InsuranceCompanyService();
        InsuranceService insuranceService = new InsuranceService();
        PaymentMovementService paymentMovementService = new PaymentMovementService();
        CustomerService customerService = new CustomerService();
        PolicyService policyService = new PolicyService();
        VehicleService vehicleService = new VehicleService();
        AccidentService accidentService = new AccidentService();
        InsuranceRequestService insuranceRequestService = new InsuranceRequestService();
        ProposalService proposalService = new ProposalService();

        BankAccount bankAccount = bankAccountService.createBankAccount("Ziraat", "TR7364872374983",
                new BigDecimal(10000));
        BankAccount bankAccount1 = bankAccountService.createBankAccount("Yapı Kredi", "TR48777433",
                new BigDecimal(12330));
        BankAccount bankAccount2 = bankAccountService.createBankAccount("Yapı Kredi", "TR490680595",
                new BigDecimal(10000));

        Agency agency = agencyService.createAgency("Aaaa");

        PaymentMovement paymentMovement = paymentMovementService.createPaymentMovement(bankAccount1, "Comission",
                MovementType.OUTCOME, new BigDecimal(1233));

        PaymentMovement paymentMovement3 = paymentMovementService.createPaymentMovement(bankAccount2, "Comission",
                MovementType.INCOME, new BigDecimal(1233));


        PaymentMovement paymentMovement2 = paymentMovementService.createPaymentMovement(bankAccount1, "Insurance payment",
                MovementType.OUTCOME, new BigDecimal(10000));

        Insurance insurance = insuranceService.createInsurance(InsuranceTypeEnum.COMPULSORY_TRAFFIC_INSURANCE,
                "Traffic Insurance");
        InsuranceCompany insuranceCompany = insuranceCompanyService.createInsuranceCompany("Allianz Sigorta",
                "23245435", "XX", "Ataşehir/İstanbul", new BigDecimal(100));

        Customer customer = customerService.createCustomer("Egemen Kaya", CustomerTypeEnum.INDIVIDUAL);

        LocalDate accidentDate = LocalDate.of(2023, 7, 12);
        Accident accident = accidentService.createAccident(java.sql.Date.valueOf(accidentDate),"Kaza meydana geldi,",
                new BigDecimal(5000.00), 6);

        Vehicle vehicle = vehicleService.createVehicle("Sedan", "14 ABC 123", "XYZ123456789",
                "Toyota", 2022, ColorTypeEnum.BLACK);

        LocalDate startDate = LocalDate.of(2023, 7, 1);
        LocalDate endDate = LocalDate.of(2024, 7, 1);
        Policy policy = policyService.createPolicy(insuranceCompany, vehicle, new BigDecimal(900000),
                java.sql.Date.valueOf(startDate), java.sql.Date.valueOf(endDate));

        InsuranceRequest insuranceRequest = insuranceRequestService.createInsuranceRequest(vehicle, policy);

        LocalDate startDate1 = LocalDate.of(2023, 7, 1);
        LocalDate endDate1 = LocalDate.of(2024, 7, 1);
        LocalDate expireDate = LocalDate.of(2023, 7, 12);
        Proposal proposal = proposalService.createProposal(insuranceCompany, vehicle, new BigDecimal(12000),
                java.sql.Date.valueOf(startDate1), java.sql.Date.valueOf(endDate1), java.sql.Date.valueOf(expireDate),
                true, new BigDecimal(10000));

        insuranceRequestService.addProposalToInsuranceRequest(proposal, insuranceRequest);

        vehicleService.addAccidentToVehicle(accident, vehicle);

        insuranceCompanyService.addInsuranceToInsuranceCompany(insurance, insuranceCompany);
        insuranceCompanyService.addBankAccountToInsuranceCompany(bankAccount1, insuranceCompany);
        insuranceCompanyService.addPaymentMovementToInsuranceCompany(paymentMovement, insuranceCompany);

        customerService.addVehicleToCustomer(vehicle, customer);
        customerService.addPaymentMovementToCustomer(paymentMovement2, customer);
        customerService.addBankAccountToCustomer(bankAccount, customer);
        customerService.addPolicyToCustomer(policy, customer);
        customerService.addInsuranceRequestToCustomer(customer, insuranceRequest);

        agencyService.addInsuranceCompanyToAgency(agency, insuranceCompany);
        agencyService.addBankAccountToAgency(agency,bankAccount);
        agencyService.addCustomerToAgency(customer, agency);
        agencyService.addPaymentMovementToAgency(paymentMovement3, agency);
        System.out.println(agency.toString());
    }
}