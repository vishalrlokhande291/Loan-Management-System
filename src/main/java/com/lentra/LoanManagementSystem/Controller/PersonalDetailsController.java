package com.lentra.LoanManagementSystem.Controller;

import com.lentra.LoanManagementSystem.Entity.PersonalDetails;
import com.lentra.LoanManagementSystem.Service.PersonalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonalDetailsController {
    @Autowired
    private PersonalDetailsService personalDetailsService;

    @PostMapping("/updateDetails")
    public ResponseEntity<PersonalDetails> updatePersonalDetails(@RequestBody PersonalDetails personalDetails){
        PersonalDetails personalDetails1=personalDetailsService.updatePersonalDetails(personalDetails);
        if(personalDetails!=null){
            return new ResponseEntity<PersonalDetails>(personalDetails1, HttpStatus.OK);
        }else {
            return new ResponseEntity<PersonalDetails>(personalDetails1,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/getDetails")
    public PersonalDetails getDetailsById(@PathVariable String applicant_refId){
        return personalDetailsService.getDetailsById(applicant_refId);
    }
}
