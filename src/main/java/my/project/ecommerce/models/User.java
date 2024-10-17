package my.project.ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class User extends BaseModel{
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String emailAddress;
    private String password;
    private String sessionToken;
    private LocalDateTime sessionStartTime;
    private LocalDateTime sessionEndTime;
    @OneToMany(mappedBy = "id")
    private Set<Role> roles;
}
