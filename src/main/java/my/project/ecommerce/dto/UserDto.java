package my.project.ecommerce.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private String emailAddress;
    private String name;
    //Store the password as encrypted hashcode obtained from auth server
    private String password;
    private String contactNumber;
}
