package my.project.ecommerce.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class ProductCategory extends BaseModel{
    private String name;
}
