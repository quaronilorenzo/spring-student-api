package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            // Evita di inserire se ci sono già dati
            if (repository.count() == 0) {
                Student lorenzo = new Student(
                        "Lorenzo@gmail.com",
                        "lorenzo",
                        LocalDate.of(2000, Month.JANUARY, 5)
                );
                Student alex = new Student(
                        "alex@gmail.com",
                        "alex",
                        LocalDate.of(2004, Month.MARCH, 3)
                );

                repository.saveAll(List.of(lorenzo, alex));
            }
        };
    }

}
