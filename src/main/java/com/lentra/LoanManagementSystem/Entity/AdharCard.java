package com.lentra.LoanManagementSystem.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "AdharCard")
@Data
@NoArgsConstructor
public class AdharCard {
    @Id
    private String adharNo;

    private String DOB;
    private String name;

    public AdharCard(String adharNo, String DOB, String name) {
        this.adharNo = adharNo;
        this.DOB = DOB;
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdharNo() {
        return adharNo;
    }

    public void setAdharNo(String adharNo) {
        this.adharNo = adharNo;
    }
}
