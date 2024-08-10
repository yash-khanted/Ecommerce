package my.project.ecommerce.converters;

import my.project.ecommerce.dto.UserDto;
import my.project.ecommerce.models.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(UserDto userDto);
}
