package com.klu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.klu.model.Application;
import com.klu.service.ApplicationService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/applications")
public class ApplicationController {

    private final ApplicationService service;

    public ApplicationController(ApplicationService service) {
        this.service = service;
    }

    // Get all
    @GetMapping
    public List<Application> getAll() {
        return service.getAllApplications();
    }

    // Apply
    @PostMapping
    public Application apply(@RequestBody Application app) {
        return service.saveApplication(app);
    }

    // Approve
    @PutMapping("/{id}/approve")
    public Application approve(@PathVariable Long id) {
        return service.approveApplication(id);
    }

    // Reject
    @PutMapping("/{id}/reject")
    public Application reject(@PathVariable Long id) {
        return service.rejectApplication(id);
    }
}