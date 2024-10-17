package my.project.ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Role extends BaseModel{
    private String name;
    private String description;
}
