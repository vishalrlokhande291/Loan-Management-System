package com.lentra.LoanManagementSystem.Repository;

import com.lentra.LoanManagementSystem.Entity.AdharCard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableMongoRepositories
public interface AdharCardRepo extends MongoRepository<AdharCard,String> {

    AdharCard findByAdharNo(String adharNo);
}
