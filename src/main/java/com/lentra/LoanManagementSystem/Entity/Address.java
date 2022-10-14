package com.lentra.LoanManagementSystem.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection="Address")
public class Address {

    private String village;
    private String district;
    private String state;
    private String pin;

    public Address(String village, String district, String state, String pin) {
        super();
        this.village = village;
        this.state = district;
        this.district = state;
        this.pin = pin;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getPermanent() {
        return state;
    }

    public void setPermanent(String permanent) {
        this.state = permanent;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

}
