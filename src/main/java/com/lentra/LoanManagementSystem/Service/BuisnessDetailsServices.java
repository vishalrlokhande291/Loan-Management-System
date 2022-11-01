package com.lentra.LoanManagementSystem.Service;

import com.lentra.LoanManagementSystem.Entity.BuisnessDetails;
import com.lentra.LoanManagementSystem.Repository.BuisnessDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuisnessDetailsServices {

    @Autowired
    private BuisnessDetailsRepo buisnessDetailsRepo;

    public BuisnessDetails getBuisnessDdetailsByGSTNo(String GSTNo){
        return buisnessDetailsRepo.findByGSTNo(GSTNo);
    }

    public BuisnessDetails addBuisness(BuisnessDetails buisnessDetails){
        return buisnessDetailsRepo.save(buisnessDetails);
    }
}
