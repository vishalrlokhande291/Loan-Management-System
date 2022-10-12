package com.lentra.LoanManagementSystem.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class PersonalDetails {
    @Id
    private String applicant_refId;
    private String applicant_DOB;
    private String applicant_DOI;
    private String applicant_pan;
    private String applicant_udyanNo;
    private String applicant_income;

    public String getApplicant_DOB() {
        return applicant_DOB;
    }

    public void setApplicant_DOB(String applicant_DOB) {
        this.applicant_DOB = applicant_DOB;
    }

    public String getApplicant_DOI() {
        return applicant_DOI;
    }

    public void setApplicant_DOI(String applicant_DOI) {
        this.applicant_DOI = applicant_DOI;
    }

    public String getApplicant_pan() {
        return applicant_pan;
    }

    public void setApplicant_pan(String applicant_pan) {
        this.applicant_pan = applicant_pan;
    }

    public String getApplicant_udyanNo() {
        return applicant_udyanNo;
    }

    public void setApplicant_udyanNo(String applicant_udyanNo) {
        this.applicant_udyanNo = applicant_udyanNo;
    }

}
