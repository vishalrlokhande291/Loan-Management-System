package com.lentra.LoanManagementSystem.Service;

import com.lentra.LoanManagementSystem.Entity.BasicInfo;
import com.lentra.LoanManagementSystem.Repository.BasicInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasicInfoService {
    @Autowired
    private BasicInfoRepo basicInfoRepo;

    public String addApplicant(BasicInfo applicant){
        basicInfoRepo.save(applicant);
        return "Added SucessFully";
    }

    public BasicInfo getApplicantByMobile(String applicantMobile){
        return basicInfoRepo.findById(applicantMobile).orElse(null);
    }

    public BasicInfo getApplicantByRefId(String applicantRefId){
        return basicInfoRepo.findByRefId(applicantRefId);
    }
}
