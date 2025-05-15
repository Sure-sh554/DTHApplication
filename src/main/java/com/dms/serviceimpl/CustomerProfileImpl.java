package com.dms.serviceimpl;

import com.dms.entity.CustomerProfile;
import com.dms.repository.CustomerProfileRepo;
import com.dms.service.ICustomerProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerProfileImpl implements ICustomerProfile {
    @Autowired
    private CustomerProfileRepo customerProfileRepo;


    @Override
    public CustomerProfile save(CustomerProfile customerProfile) {
        return customerProfileRepo.save(customerProfile);
    }

    @Override
    public List<CustomerProfile> getAll() {
        return customerProfileRepo.findAll();
    }

    @Override
    public CustomerProfile getById(String id) {
        Optional<CustomerProfile> result = customerProfileRepo.findById(id);
        return result.orElse(null);
    }

    @Override
    public void deleteById(String id) {
        customerProfileRepo.deleteById(id);

    }
}
