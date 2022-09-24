package demo.demo.student;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service; 

@Service // makes it be a bean
public class StudentService {
    public List<Student> getStudents(){
		return List.of(
			  new Student(
				1L,
				"Mariam",
				"mariam.jamal@gmail.com",
				LocalDate.of(2000, Month.JANUARY, 5),
				21
			)
		);
	}
}
