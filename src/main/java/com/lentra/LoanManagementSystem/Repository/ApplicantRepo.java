package com.lentra.LoanManagementSystem.Repository;

import com.lentra.LoanManagementSystem.Entity.Applicant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableMongoRepositories
public interface ApplicantRepo extends MongoRepository<Applicant,String> {

    Applicant findByaplicantRefId(String applicantRefId);
}
