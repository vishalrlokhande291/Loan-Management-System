package com.lentra.LoanManagementSystem.Service;

import com.lentra.LoanManagementSystem.Entity.Applicant;
import com.lentra.LoanManagementSystem.Repository.ApplicantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicantService {
    @Autowired
    private ApplicantRepo basicInfoRepo;

    public Applicant addAplicant(Applicant applicant){
       return basicInfoRepo.save(applicant);
    }

    public Applicant getApplicantByMobile(String applicantMobile){
        return basicInfoRepo.findById(applicantMobile).orElse(null);
    }

    public Applicant getApplicantByRefId(String applicantRefId){
        return basicInfoRepo.findByaplicantRefId(applicantRefId);
    }
}
