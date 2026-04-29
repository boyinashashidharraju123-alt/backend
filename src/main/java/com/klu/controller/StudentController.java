package com.klu.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.klu.model.Student;
import com.klu.service.StudentService;

@RestController
@CrossOrigin
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getAll() {
        return service.getAllStudents();
    }

    @PostMapping
    public Student add(@RequestBody Student s) {
        return service.saveStudent(s);
    }
}