
package demo.demo.student;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository
 extends JpaRepository<Student,Long>{

    // Optional 
    @Query("SELECT s FROM Student s WHERE s.email =?1")
    // Optional<Student> findByEmail(String email);
    Optional<Student> findStudentByEmail(String email);
 }