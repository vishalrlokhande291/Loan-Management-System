package com.lentra.LoanManagementSystem.Repository;

import com.lentra.LoanManagementSystem.Entity.Applicant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepo extends MongoRepository<Applicant,String> {
}
