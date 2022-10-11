package com.lentra.LoanManagementSystem.Controller;

import com.lentra.LoanManagementSystem.Entity.Applicant;
import com.lentra.LoanManagementSystem.Service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/applicant")
public class ApplicantController {
    @Autowired
    private ApplicantService applicantService;

    @PostMapping("/newApplicant")
    public String addApplicant(@RequestBody Applicant applicant){
        return applicantService.addApplicant(applicant);
    }
    @GetMapping("/applicant/{applicant_mobile}")
    public Applicant getApplicantByMobile(@PathVariable String applicant_mobile){
        return applicantService.getApplicantByMobile(String applicant_mobile);
    }

}
