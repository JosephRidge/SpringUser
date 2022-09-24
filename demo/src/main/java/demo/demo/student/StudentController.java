package demo.demo.student;
 

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student") // sets url path to follow

 public class StudentController {
     private final StudentService studentService;

     @Autowired
     public StudentController(StudentService studentService){
         this.studentService = studentService;
     }

    @GetMapping // set the first et verb 
     public List<Student> getStudents(){
         return studentService.getStudents();
     }
}
