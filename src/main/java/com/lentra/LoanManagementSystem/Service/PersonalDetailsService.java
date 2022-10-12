package com.lentra.LoanManagementSystem.Service;

import com.lentra.LoanManagementSystem.Entity.PersonalDetails;
import com.lentra.LoanManagementSystem.Repository.PersonalDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalDetailsService {
    @Autowired
    private PersonalDetailsRepo personalDetailsRepo;

    public PersonalDetails updatePersonalDetails(PersonalDetails personalDetails){
        return personalDetailsRepo.save(personalDetails);
    }

    public PersonalDetails getDetailsById(String applicant_refId){
        return personalDetailsRepo.findById(applicant_refId).orElse(null);
    }
}
