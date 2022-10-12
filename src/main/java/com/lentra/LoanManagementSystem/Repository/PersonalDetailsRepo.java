package com.lentra.LoanManagementSystem.Repository;

import com.lentra.LoanManagementSystem.Entity.PersonalDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalDetailsRepo extends MongoRepository<PersonalDetails,String> {
}
