package turatbek.tor.springproject.service.Impl;

import org.springframework.stereotype.Service;
import turatbek.tor.springproject.model.Student;
import turatbek.tor.springproject.service.StudentService;

import java.util.List;
@Service

public class InMemoryStudentServiceImpl implements StudentService {

    @Override
    public List<Student> findAllStudent() {
        return null;
    }


    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public Student findByEmail(String email) {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public void deleteStudent(String email) {

    }
}
