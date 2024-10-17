package my.project.ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@Entity
public class Consumer extends BaseModel implements Serializable {
    @OneToOne
    private User user;
    @ElementCollection
    @CollectionTable(name = "wishlist")
    private Set<Product> wishlist;
    @ElementCollection
    @CollectionTable(name = "cart")
    private Set<Product> cart;
    //represents the product and quantity chosen
    @OneToMany(mappedBy = "id")
    private List<Order> orders;
}
