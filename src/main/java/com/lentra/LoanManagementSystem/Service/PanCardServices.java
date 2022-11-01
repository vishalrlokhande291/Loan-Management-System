package com.lentra.LoanManagementSystem.Service;

import com.lentra.LoanManagementSystem.Entity.PanCard;
import com.lentra.LoanManagementSystem.Repository.PanCardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PanCardServices {
    @Autowired
    private PanCardRepo panCardRepo;

    public PanCard getPanCardByPanNo(String panNo){
        return panCardRepo.findByPanNo(panNo);
    }

    public PanCard addPan(PanCard panCard){
        return panCardRepo.save(panCard);
    }
//    public String addPan(PanCard panCard){
//        panCardRepo.save(panCard);
//        return "added...!";
//    }
}
