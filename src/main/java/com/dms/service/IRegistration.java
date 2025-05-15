package com.dms.service;

import com.dms.entity.Registration;

import java.util.List;

public interface IRegistration {
    Registration save(Registration registration);
    List<Registration> getAll();
    Registration getById(String id);
    void deleteById(String id);
}
