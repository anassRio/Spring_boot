package com.rionass.demonstration.student;



import lombok.*;

import java.time.LocalDate;

@Value
@AllArgsConstructor

public class Student {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;
}
