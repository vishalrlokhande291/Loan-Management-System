package com.lentra.LoanManagementSystem.Controller;

import com.lentra.LoanManagementSystem.Entity.Applicant;
import com.lentra.LoanManagementSystem.Service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/applicant")
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;

     @GetMapping("/{aplicantMobile}")
    public Applicant getApplicantByAplicantMobile(@PathVariable String aplicantMobile){
         return getApplicantByAplicantMobile(aplicantMobile);
     }
     @GetMapping("/{applicantByRefId}")
    public Applicant getApplicantByAplicantRefId(@PathVariable String applicantRefId){
         return getApplicantByAplicantRefId(applicantRefId);
     }
     @GetMapping("/{applicantPan}")
    public Applicant getApplicantByAplicantPan(@PathVariable String applicantPan){
         return getApplicantByAplicantPan(applicantPan);
     }

     @PostMapping("/addApplicant")
    public ResponseEntity<Applicant> addAplicant(@RequestBody Applicant applicant){
         Applicant applicant1=applicantService.addAplicant(applicant);
         if(applicant1!=null){
             return new ResponseEntity<Applicant>(applicant1, HttpStatus.OK);
         }else{
             return new ResponseEntity<Applicant>(applicant1, HttpStatus.OK);
         }
     }

     @PutMapping("/updateApplicant")
    public ResponseEntity<Applicant> updateApplicant(@RequestBody Applicant applicant){
         Applicant applicant1=applicantService.addAplicant(applicant);
         if(applicant1!=null){
             return new ResponseEntity<Applicant>(applicant1, HttpStatus.OK);
         }else{
             return new ResponseEntity<Applicant>(applicant1, HttpStatus.OK);
         }
     }

}
