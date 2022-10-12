package com.lentra.LoanManagementSystem.Entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Address")
public class Address {
    private String address;

    private Applicant applicant;

    public Address(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
