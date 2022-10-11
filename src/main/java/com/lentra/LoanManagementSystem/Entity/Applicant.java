package com.lentra.LoanManagementSystem.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Applicant {
    private String aplicant_name;
    @Id
    private String aplicant_mobile;
    private String aplicant_email;
//    private String aplicant_refId;
//    private String aplicant_exRefId;

    public String getAplicant_name() {
        return aplicant_name;
    }

    public void setAplicant_name(String aplicant_name) {
        this.aplicant_name = aplicant_name;
    }

    public String getAplicant_mobile() {
        return aplicant_mobile;
    }

    public void setAplicant_mobile(String aplicant_mobile) {
        this.aplicant_mobile = aplicant_mobile;
    }

    public String getAplicant_email() {
        return aplicant_email;
    }

    public void setAplicant_email(String aplicant_email) {
        this.aplicant_email = aplicant_email;
    }
}
