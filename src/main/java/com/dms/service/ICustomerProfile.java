package com.dms.service;

import com.dms.entity.CustomerProfile;

import java.util.List;

public interface ICustomerProfile {
    CustomerProfile save(CustomerProfile customerProfile);
    List<CustomerProfile> getAll();
    CustomerProfile getById(String id);
    void deleteById(String id);
}
