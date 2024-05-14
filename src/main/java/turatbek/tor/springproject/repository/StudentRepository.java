package turatbek.tor.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import turatbek.tor.springproject.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
    void deleteByEmail(String email);
    Student findStudentByEmail(String email);

}