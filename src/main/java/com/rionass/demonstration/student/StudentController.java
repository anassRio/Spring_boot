package com.rionass.demonstration.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Make the class to serve rest Endpoint
@RestController
// get mapping to student controller
@RequestMapping(path ="api/v1/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Specify Endpoint Get
    @GetMapping
    public List<Student> getStudent() {
        return studentService.getStudent();
    }
}
