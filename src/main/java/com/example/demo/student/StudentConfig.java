package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.JANUARY;
import static java.util.Calendar.MARCH;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Lorenzo = new Student(
                        "Lorenzo@gmail.com",
                        "lorenzo",
                        LocalDate.of(2000, Month.JANUARY,5),
                        25
                );
            Student Alex = new Student(
                    "alex@gmail.com",
                    "alex",
                    LocalDate.of(2004, MARCH,3),
                    21
            );
            repository.saveAll(
                    List.of(Lorenzo, Alex)
            );
        };
    }
}
