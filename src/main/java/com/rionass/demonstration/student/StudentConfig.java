package com.rionass.demonstration.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.APRIL;
import static java.util.Calendar.MARCH;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student anass = new Student(
                    "Anass",
                    "rouimi.anass@gmail.com",
                    LocalDate.of(1990, MARCH, 20),
                    32);

            Student toto = new Student(
                    "TOTO",
                    "tofo.rio@gmail.com",
                    LocalDate.of(1994, APRIL, 05),
                    28);

            repository.saveAll(List.of(anass, toto));
        };
    }
}
