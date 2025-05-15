package com.dms.repository;

import com.dms.entity.CustomerProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerProfileRepo extends MongoRepository<CustomerProfile, String> {}