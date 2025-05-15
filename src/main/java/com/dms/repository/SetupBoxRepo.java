package com.dms.repository;

import com.dms.entity.SetupBox;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SetupBoxRepo extends MongoRepository<SetupBox, String> {}