package com.dms.controller;

import com.dms.entity.SetupBox;
import com.dms.repository.SetupBoxRepo;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/setupbox")
@Tag(name = "SetupBox", description = "SetupBox Management APIs")
public class SetupBoxController {

    @Autowired
    private SetupBoxRepo repo;

    @PostMapping("/save")
    public SetupBox save(@RequestBody SetupBox sb) {
        return repo.save(sb);
    }

    @GetMapping("/all")
    public List<SetupBox> getAll() {
        return repo.findAll();
    }
}