package com.rionass.demonstration.student;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Make the class to serve rest Endpoint
@RestController
// get mapping to student controller
@RequestMapping(path ="api/v1/student")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

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

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId){
        studentService.deleteStudent(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(
            @PathVariable("studentId") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email){

        studentService.updateStudent(studentId, name, email);
    }
}
