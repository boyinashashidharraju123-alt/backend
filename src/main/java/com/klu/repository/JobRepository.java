package com.klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klu.model.Job;

public interface JobRepository extends JpaRepository<Job, Long> {
}