package my.project.ecommerce.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class OrderStatus extends BaseModel{
    private String status;
}
