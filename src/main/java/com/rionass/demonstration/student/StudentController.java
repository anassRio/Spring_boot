package com.rionass.demonstration.student;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    //Specify EndPoint Post
    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }
}
