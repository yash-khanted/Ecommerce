package my.project.ecommerce.models;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.util.Date;
@MappedSuperclass
@Data
public class Base {
    private Date createdAt;
    private Date modifiedAt;
    private boolean isDeleted;
}
