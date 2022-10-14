package com.lentra.LoanManagementSystem.Service;

import com.lentra.LoanManagementSystem.Entity.Address;
import com.lentra.LoanManagementSystem.Repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepo addressRepo;

    public Address save(Address address){
        return addressRepo.save(address);
    }
    public List<Address> saveMultiAddress(List<Address>addresses){
        return addressRepo.saveAll(addresses);
    }
//    public Address getAddress(){
//        return addressRepo.findById();
//    }
}
