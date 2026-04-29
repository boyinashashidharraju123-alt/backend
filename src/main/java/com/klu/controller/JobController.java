package com.klu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.klu.model.Job;
import com.klu.service.JobService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/jobs")
public class JobController {

    private final JobService service;

    public JobController(JobService service) {
        this.service = service;
    }

    // Get all jobs
    @GetMapping
    public List<Job> getAll() {
        return service.getAllJobs();
    }

    // Create job
    @PostMapping
    public Job add(@RequestBody Job job) {
        return service.saveJob(job);
    }
}