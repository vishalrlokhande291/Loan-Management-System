package com.lentra.LoanManagementSystem.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@Document(collection = "BuisnessDetails")
public class BuisnessDetails {
    @Id
    private String GSTNo;
    private String BuisnessName;
    private String numberOfEmpoyees;
    private String Constitution;
    private Date registrationDate;
    private String taxPayerType;
    private Boolean GSTINStatus;

    public BuisnessDetails(String GSTNo, String buisnessName, String numberOfEmpoyees) {
        this.GSTNo = GSTNo;
        BuisnessName = buisnessName;
        this.numberOfEmpoyees = numberOfEmpoyees;
    }

    public String getGSTNo() {
        return GSTNo;
    }

    public void setGSTNo(String GSTNo) {
        this.GSTNo = GSTNo;
    }

    public String getBuisnessName() {
        return BuisnessName;
    }

    public void setBuisnessName(String buisnessName) {
        BuisnessName = buisnessName;
    }

    public String getNumberOfEmpoyees() {
        return numberOfEmpoyees;
    }

    public void setNumberOfEmpoyees(String numberOfEmpoyees) {
        this.numberOfEmpoyees = numberOfEmpoyees;
    }
}
