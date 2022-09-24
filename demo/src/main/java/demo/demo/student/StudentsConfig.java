package demo.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentsConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student heich = new Student( 
                    "Heeeeeich",
                    "h.hh@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
                   );

            Student john = new Student( 
                    "John",
                    "john.doel@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 5)
                    );

                    // save to DB 
                    repository.saveAll(
                        List.of(heich, john)
                    );

        };
    }
}
