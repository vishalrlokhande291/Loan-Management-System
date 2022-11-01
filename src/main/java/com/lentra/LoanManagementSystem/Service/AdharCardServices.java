package com.lentra.LoanManagementSystem.Service;

import com.lentra.LoanManagementSystem.Entity.AdharCard;
import com.lentra.LoanManagementSystem.Repository.AdharCardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdharCardServices {
    @Autowired
    private AdharCardRepo adharCardRepo;

    public AdharCard getAdharCardByAdharNo(String adharNo){
        return adharCardRepo.findByAdharNo(adharNo);
    }

    public AdharCard addAdhar(AdharCard adharCard){
        return adharCardRepo.save(adharCard);
    }
}
