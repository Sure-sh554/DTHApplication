package com.dms.service;

import com.dms.entity.Address;
import java.util.List;

public interface IAddress {
    Address saveAddress(Address address);
    List<Address> getAllAddresses();
    Address getAddressById(String id);
    void deleteAddress(String id);
}