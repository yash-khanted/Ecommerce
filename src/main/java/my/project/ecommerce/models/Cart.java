package my.project.ecommerce.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;
import java.util.Set;
@Data
@Entity
public class Cart extends BaseModel{
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private User consumer;
    @OneToMany
    private Set<Product> product;
}
