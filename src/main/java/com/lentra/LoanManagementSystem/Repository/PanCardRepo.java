package com.lentra.LoanManagementSystem.Repository;

import com.lentra.LoanManagementSystem.Entity.PanCard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableMongoRepositories
public interface PanCardRepo extends MongoRepository<PanCard,String> {

    PanCard findByPanNo(String panNo);
}
