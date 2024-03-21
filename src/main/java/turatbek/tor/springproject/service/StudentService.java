package turatbek.tor.springproject.service;

import org.springframework.stereotype.Service;
import turatbek.tor.springproject.model.Student;

import java.util.List;


public interface StudentService {
    List<Student> findAllStudent();
    Student saveStudent(Student student);
    Student findByEmail(String email);
    Student updateStudent(Student student);
    void deleteStudent(String email);
}
