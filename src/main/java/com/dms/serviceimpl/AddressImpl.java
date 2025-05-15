package com.dms.serviceimpl;

import com.dms.entity.Address;
import com.dms.repository.AddressRepo;
import com.dms.service.IAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressImpl implements IAddress {

    @Autowired
    private AddressRepo addressRepo;

    public Address saveAddress(Address address) {
        return addressRepo.save(address);
    }

    public List<Address> getAllAddresses() {
        return addressRepo.findAll();
    }

    public Address getAddressById(String id) {
        Optional<Address> optional = addressRepo.findById(id);
        return optional.orElse(null);
    }

    public void deleteAddress(String id) {
        addressRepo.deleteById(id);
    }
}