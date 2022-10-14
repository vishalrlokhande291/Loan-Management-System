package com.lentra.LoanManagementSystem.Repository;

import com.lentra.LoanManagementSystem.Entity.BasicInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicInfoRepo extends MongoRepository<BasicInfo,String> {
    BasicInfo findByRefId(String applicantRefId);
}
