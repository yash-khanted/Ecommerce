package my.project.ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Role {
    @Id
    private int id;
    @Enumerated
    private UserRole UserRole;
}
