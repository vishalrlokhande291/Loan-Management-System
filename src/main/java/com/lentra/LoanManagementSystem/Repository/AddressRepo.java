package com.lentra.LoanManagementSystem.Repository;

import com.lentra.LoanManagementSystem.Entity.Address;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends MongoRepository<Address,String> {

}
