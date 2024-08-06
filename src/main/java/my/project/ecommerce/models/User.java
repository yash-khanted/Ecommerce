package my.project.ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity(name = "user")
public class User extends BaseModel{
    private String name;
    private String mobileNumber;
    private String emailAddress;
    private String password;
    private String sessionToken;
    private LocalDateTime sessionStartTime;
    private LocalDateTime sessionEndTime;
    @OneToMany(mappedBy = "id")
    private List<Role> roles;
}
