package turatbek.tor.springproject.service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import turatbek.tor.springproject.model.Student;
import turatbek.tor.springproject.repository.InMemoryStudentDAO;
import turatbek.tor.springproject.service.StudentService;

import java.util.List;
@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {
    private final InMemoryStudentDAO repository;

    @Override
    public List<Student> findAllStudent() {
        return repository.findAllStudent();
    }


    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
