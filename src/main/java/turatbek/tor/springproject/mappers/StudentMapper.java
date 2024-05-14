package turatbek.tor.springproject.mappers;

import org.mapstruct.Mapping;
import turatbek.tor.springproject.dtos.StudentDTO;
import turatbek.tor.springproject.model.Student;

public interface StudentMapper {

    @Mapping(target = "userId", source = "user.id")
    StudentDTO studentToStudentDTO(Student student);

    @Mapping(target = "user.id", source = "userId")
    Student studentDTOtoStudent(StudentDTO studentDTO);
}
