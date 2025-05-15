package com.dms.controller;

import com.dms.entity.CustomerProfile;
import com.dms.repository.CustomerProfileRepo;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
@Tag(name = "Customer Profile", description = "Customer Profile Management APIs")
public class CustomerProfileController {

    @Autowired
    private CustomerProfileRepo repo;

    @PostMapping("/save")
    public CustomerProfile save(@RequestBody CustomerProfile cp) {
        return repo.save(cp);
    }

    @GetMapping("/all")
    public List<CustomerProfile> getAll() {
        return repo.findAll();
    }
}