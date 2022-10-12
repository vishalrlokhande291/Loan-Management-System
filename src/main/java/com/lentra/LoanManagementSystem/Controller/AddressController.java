package com.lentra.LoanManagementSystem.Controller;

import com.lentra.LoanManagementSystem.Entity.Address;
import com.lentra.LoanManagementSystem.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;
    @PostMapping("/updateAddress")
    public ResponseEntity<Address>save(@RequestBody Address address){
        Address address1=addressService.save(address);
        if(address!=null){
            return new ResponseEntity<Address>(address1, HttpStatus.OK);
        }else{
            return new ResponseEntity<Address>(address1, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
//    @GetMapping
//    public Address getAddress(){
//        return addressService.getAddress();
//    }
}
