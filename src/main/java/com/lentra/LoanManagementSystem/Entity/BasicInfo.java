package com.lentra.LoanManagementSystem.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@Document(collection="Applicant")
public class BasicInfo {
    private String aplicantName;
    @Id
    private String aplicantMoble;
    private String aplicantEmail;
    private String aplicantRefId;
    private String aplicantExRefId;
    private String applicantRefId;
    private String applicantType;
    private String applicantDOB;
    private String applicantDOI;
    private String applicantPan;
    private String applicantUdyanNo;
    private String applicantIncome;


    @DBRef
    private List<Address> addressList;


    public BasicInfo(String aplicantName, String aplicantMoble, String aplicantEmail, String aplicantRefId, String aplicantExRefId, String applicantRefId, String applicantType, String applicantDOB, String applicantDOI, String applicantPan, String applicantUdyanNo, String applicantIncome) {
        super();
        this.aplicantName = aplicantName;
        this.aplicantMoble = aplicantMoble;
        this.aplicantEmail = aplicantEmail;
        this.aplicantRefId = aplicantRefId;
        this.aplicantExRefId = aplicantExRefId;
        this.applicantRefId = applicantRefId;
        this.applicantType = applicantType;
        this.applicantDOB = applicantDOB;
        this.applicantDOI = applicantDOI;
        this.applicantPan = applicantPan;
        this.applicantUdyanNo = applicantUdyanNo;
        this.applicantIncome = applicantIncome;
    }

    public String getAplicantRefId() {
        return aplicantRefId;
    }

    public void setAplicantRefId(String aplicantRefId) {
        this.aplicantRefId = aplicantRefId;
    }

    public String getAplicantExRefId() {
        return aplicantExRefId;
    }

    public void setAplicantExRefId(String aplicantExRefId) {
        this.aplicantExRefId = aplicantExRefId;
    }

    public String getAplicantName() {
        return aplicantName;
    }

    public void setAplicantName(String aplicantName) {
        this.aplicantName = aplicantName;
    }

    public String getAplicant_mobile() {
        return aplicantMoble;
    }

    public void setAplicant_mobile(String aplicant_mobile) {
        this.aplicantMoble = aplicant_mobile;
    }

    public String getAplicantEmail() {
        return aplicantEmail;
    }

    public void setAplicantEmail(String aplicantEmail) {
        this.aplicantEmail = aplicantEmail;
    }

    public String getApplicantDOB() {
        return applicantDOB;
    }

    public void setApplicantDOB(String applicantDOB) {
        this.applicantDOB = applicantDOB;
    }

    public String getApplicantDOI() {
        return applicantDOI;
    }

    public void setApplicantDOI(String applicantDOI) {
        this.applicantDOI = applicantDOI;
    }

    public String getApplicantPan() {
        return applicantPan;
    }

    public void setApplicantPan(String applicantPan) {
        this.applicantPan = applicantPan;
    }

    public String getApplicantUdyanNo() {
        return applicantUdyanNo;
    }

    public void setApplicantUdyanNo(String applicantUdyanNo) {
        this.applicantUdyanNo = applicantUdyanNo;
    }
}
