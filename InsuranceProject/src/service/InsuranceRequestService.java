package service;

import model.InsuranceRequest;
import model.Policy;
import model.Proposal;
import model.Vehicle;

import java.util.ArrayList;

public class InsuranceRequestService {
    public InsuranceRequest createInsuranceRequest(Vehicle vehicle, Policy policy){
        InsuranceRequest insuranceRequest = new InsuranceRequest();
        insuranceRequest.setVehicle(vehicle);
        insuranceRequest.setPolicy(policy);
        return insuranceRequest;
    }

    public void addProposalToInsuranceRequest(Proposal proposal, InsuranceRequest insuranceRequest){
        if(insuranceRequest.getProposalList() != null){
            insuranceRequest.getProposalList().add(proposal);
        } else {
            ArrayList<Proposal> proposalList = new ArrayList<>();
            proposalList.add(proposal);
            insuranceRequest.setProposalList(proposalList);
        }
    }
}
