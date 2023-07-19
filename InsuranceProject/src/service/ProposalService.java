package service;

import com.sun.org.apache.bcel.internal.generic.NEW;
import model.InsuranceCompany;
import model.Proposal;
import model.Vehicle;

import java.math.BigDecimal;
import java.util.Date;

public class ProposalService {
    VehicleService vehicleService = new VehicleService();
    public Proposal createProposal(InsuranceCompany company, Vehicle vehicle, BigDecimal offerPrice,
                                   Date startDate, Date endDate, Date expireDate, Boolean isApproved,
                                   BigDecimal discountPrice){
        Proposal proposal = new Proposal();
        proposal.setCompany(company);
        proposal.setVehicle(vehicle);
        proposal.setOfferPrice(calculateAccordingToAccidentOfferPrice(offerPrice, vehicle));
        proposal.setStartDate(startDate);
        proposal.setEndDate(endDate);
        proposal.setExpireDate(expireDate);
        proposal.setApproved(isApproved);
        proposal.setDiscountPrice(discountPrice);
        return proposal;
    }

    public BigDecimal getDiscountedPrice(Proposal proposal){
        if(proposal.getDiscountPrice()!=null){
            return proposal.getOfferPrice().subtract(proposal.getDiscountPrice());
        }
        else{
            return proposal.getOfferPrice();
        }
    }
    public BigDecimal calculateAccordingToAccidentOfferPrice(BigDecimal offerPrice, Vehicle vehicle) {
        BigDecimal totalOfferPrice = BigDecimal.ZERO;

        BigDecimal totalDamagePrice = vehicleService.totalOfAccidentDamagePrice(vehicle);
        if(totalDamagePrice.compareTo(BigDecimal.ZERO) == 0){
            return totalOfferPrice;
        }
        else if(totalDamagePrice.compareTo(BigDecimal.ZERO) > 0 && totalDamagePrice.compareTo(new BigDecimal(4000)) <= 0) {
            totalOfferPrice = offerPrice.add(offerPrice.multiply(new BigDecimal(10)).divide(new BigDecimal(100)));
        } else if (totalDamagePrice.compareTo(new BigDecimal(4000)) > 0 && totalDamagePrice.compareTo(new BigDecimal(8000)) <= 0) {
            totalOfferPrice = offerPrice.add(offerPrice.multiply(new BigDecimal(25)).divide(new BigDecimal(100)));
        } else if (totalDamagePrice.compareTo(new BigDecimal(8000)) > 0 && totalDamagePrice.compareTo(new BigDecimal(16000)) <= 0) {
            totalOfferPrice = offerPrice.add(offerPrice.multiply(new BigDecimal(40)).divide(new BigDecimal(100)));
        } else {
            totalOfferPrice = offerPrice.add(offerPrice.multiply(new BigDecimal(80)).divide(new BigDecimal(100)));
        }
        return totalOfferPrice;
    }
}
