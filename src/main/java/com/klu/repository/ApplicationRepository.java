package com.klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klu.model.Application;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
}