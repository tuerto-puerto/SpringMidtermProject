package turatbek.tor.springproject.dtos;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.Period;

@Data
@Builder
public class StudentDTO {
    private Long id;

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String email;
    private int age;
    private String teacherId;

}
