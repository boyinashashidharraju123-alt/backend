package com.klu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.klu.model.Job;
import com.klu.repository.JobRepository;

@Service
public class JobService {

    private final JobRepository repo;

    public JobService(JobRepository repo) {
        this.repo = repo;
    }

    // Get all jobs
    public List<Job> getAllJobs() {
        return repo.findAll();
    }

    // Save job
    public Job saveJob(Job job) {
        return repo.save(job);
    }
}