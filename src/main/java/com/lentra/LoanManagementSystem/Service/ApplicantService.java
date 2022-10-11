package com.lentra.LoanManagementSystem.Service;

import com.lentra.LoanManagementSystem.Entity.Applicant;
import com.lentra.LoanManagementSystem.Repository.ApplicantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicantService {
    @Autowired
    private ApplicantRepo applicantRepo;

    public String addApplicant(Applicant applicant){
        if(applicant.equals(applicantRepo.findById(applicant.getAplicant_mobile())))
        applicantRepo.save(applicant);
        return "Added SucessFully";
    }
}
