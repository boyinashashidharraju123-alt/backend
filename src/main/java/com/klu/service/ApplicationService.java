package com.klu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.klu.model.Application;
import com.klu.repository.ApplicationRepository;

@Service
public class ApplicationService {

    private final ApplicationRepository repo;

    public ApplicationService(ApplicationRepository repo) {
        this.repo = repo;
    }

    // Get all applications
    public List<Application> getAllApplications() {
        return repo.findAll();
    }

    // Save application
    public Application saveApplication(Application app) {
        app.setStatus("PENDING");
        return repo.save(app);
    }

    // Approve
    public Application approveApplication(Long id) {
        Application app = repo.findById(id).orElseThrow();
        app.setStatus("APPROVED");
        return repo.save(app);
    }

    // Reject
    public Application rejectApplication(Long id) {
        Application app = repo.findById(id).orElseThrow();
        app.setStatus("REJECTED");
        return repo.save(app);
    }
}