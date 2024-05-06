package my.project.ecommerce.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Role {
    @Id
    private int id;
    @Enumerated
    private UserRole UserRole;
}
