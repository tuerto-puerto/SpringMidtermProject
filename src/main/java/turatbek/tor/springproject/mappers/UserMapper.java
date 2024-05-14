package turatbek.tor.springproject.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import turatbek.tor.springproject.dtos.UserDTO;
import turatbek.tor.springproject.model.User;

@Mapper
public interface UserMapper {

    @Mapping(target = "password", ignore = true)
    User userDtoToUser(UserDTO dto);

    UserDTO userToUserDto(User user);
}