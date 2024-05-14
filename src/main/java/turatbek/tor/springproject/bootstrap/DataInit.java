package turatbek.tor.springproject.bootstrap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import turatbek.tor.springproject.model.Student;
import turatbek.tor.springproject.model.User;
import turatbek.tor.springproject.repository.StudentRepository;
import turatbek.tor.springproject.repository.UserRepository;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Component
public class DataInit implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) {
        try {
            // Create users
            Set<User> users = new HashSet<>();
            for (int i = 0; i < 10; i++) {
                User user = User.builder()
                        .username("user" + i)
                        .fullName("user" + i)
                        .email("user" + i + "@example.com")
                        .password(passwordEncoder.encode("password"))
                        .build();
                users.add(user);
            }
            userRepository.saveAll(users);

            // Create students for each user
            Set<Student> students = new HashSet<>();
            for (User user : users) {
                for (int i = 0; i < 5; i++) {
                    Student student = Student.builder()
                            .firstName("StudentFirstName " + i)
                            .lastName("StudentLastName " + i)
                            .dateOfBirth(LocalDate.of(2000, 1, 1))
                            .email("student" + i + "@example.com")
                            .teacher(user)
                            .build();
                    students.add(student);
                }
            }
            studentRepository.saveAll(students);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
