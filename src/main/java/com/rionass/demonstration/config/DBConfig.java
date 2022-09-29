package com.rionass.demonstration.config;

import com.rionass.demonstration.lombok.Customer;
import com.rionass.demonstration.lombok.CustomerRepository;
import com.rionass.demonstration.lombok.CustomerService;
import com.rionass.demonstration.student.Student;
import com.rionass.demonstration.student.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.APRIL;
import static java.util.Calendar.MARCH;

@Configuration
public class DBConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository, CustomerRepository customerRepository) {
        return args -> {
            Student anass = new Student(
                    "Anass",
                    "rouimi.anass@gmail.com",
                    LocalDate.of(1990, MARCH, 20));

            Student toto = new Student(
                    "TOTO",
                    "tofo.rio@gmail.com",
                    LocalDate.of(1994, APRIL, 05));

            studentRepository.saveAll(List.of(anass, toto));

            Customer customer1 = new Customer(
                    1L,
                    "Toto",
                    "totoPWD",
                    "toto@mail.com");
            Customer customer2 = new Customer(
                    2L,
                    "Titi",
                    "titiPWD",
                    "titi@mail.com");
            customerRepository.saveAll(List.of(customer1, customer2));

        };
    }
}
