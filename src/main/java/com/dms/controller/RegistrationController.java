package com.dms.controller;

import com.dms.entity.Registration;
import com.dms.repository.RegistrationRepo;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registration")
@Tag(name = "Registration", description = "Registration Management APIs")
public class RegistrationController {

    @Autowired
    private RegistrationRepo repo;

    @PostMapping("/save")
    public Registration save(@RequestBody Registration r) {
        return repo.save(r);
    }

    @GetMapping("/all")
    public List<Registration> getAll() {
        return repo.findAll();
    }
}