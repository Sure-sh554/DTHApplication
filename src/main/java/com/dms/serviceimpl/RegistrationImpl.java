package com.dms.serviceimpl;

import com.dms.entity.Registration;
import com.dms.repository.RegistrationRepo;
import com.dms.service.IRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistrationImpl implements IRegistration {
    @Autowired
    private RegistrationRepo registrationRepo;
    @Override
    public Registration save(Registration registration) {
        return registrationRepo.save(registration);
    }

    @Override
    public List<Registration> getAll() {
        return registrationRepo.findAll();
    }

    @Override
    public Registration getById(String id) {
        Optional<Registration> result = registrationRepo.findById(id);
        return result.orElse(null);
    }

    @Override
    public void deleteById(String id) {
        registrationRepo.deleteById(id);

    }
}
