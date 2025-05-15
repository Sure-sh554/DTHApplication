package com.dms.repository;

import com.dms.entity.Registration;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegistrationRepo extends MongoRepository<Registration, String> {}