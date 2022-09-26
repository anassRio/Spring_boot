package com.rionass.demonstration.student;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent() {

        return List.of(
                new Student(
                        1L,
                        "Anass",
                        "rouimi.anass@gmail.com",
                        LocalDate.of(1990, Month.MARCH, 20),
                        32)
        );
    }
}
