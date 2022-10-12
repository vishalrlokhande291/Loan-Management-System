package com.lentra.LoanManagementSystem.Service;

import com.lentra.LoanManagementSystem.Entity.Address;
import com.lentra.LoanManagementSystem.Repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    private AddressRepo addressRepo;

    public Address save(Address address){
        return addressRepo.save(address);
    }
//    public Address getAddress(){
//        return addressRepo.findById();
//    }
}
