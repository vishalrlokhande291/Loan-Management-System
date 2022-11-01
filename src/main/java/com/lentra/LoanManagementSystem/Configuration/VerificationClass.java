package com.lentra.LoanManagementSystem.Configuration;

import com.lentra.LoanManagementSystem.Entity.AdharCard;
import com.lentra.LoanManagementSystem.Entity.PanCard;
import com.lentra.LoanManagementSystem.Service.AdharCardServices;
import com.lentra.LoanManagementSystem.Service.PanCardServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/verification")
public class VerificationClass {
    @Autowired
    private PanCardServices panCardServices;

    @Autowired
    private AdharCardServices adharCardServices;

    @GetMapping("/pan/{panNo}")
    public Boolean panIsVerified(String panNO, String DOB, String name) {
        PanCard pan = panCardServices.getPanCardByPanNo(panNO);
        if (pan.getPanNo().equals(panNO) && pan.getDOB().equals(DOB) && pan.getName().equals(name))
            return true;
        else
            return false;
    }

    @GetMapping("/adhar/{adharNo}")
    public Boolean adharIsVerified(String adharNO,String DOB, String name){
        AdharCard adharCard=adharCardServices.getAdharCardByAdharNo(adharNO);
        if (adharCard.getAdharNo().equals(adharNO) && adharCard.getDOB().equals(DOB) && adharCard.getName().equals(name))
            return true;
        else
            return false;
    }
}
