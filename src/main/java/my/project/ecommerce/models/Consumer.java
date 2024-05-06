package my.project.ecommerce.models;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
@Data
@Entity
public class Consumer extends BaseModel implements Serializable {
    private String name;
    private Address address;
    private String contactNumber;
    @ElementCollection
    @CollectionTable(name = "cart")
    private Map<Product, Integer> cart;
    //represents the product and quantity chosen
    @OneToMany(mappedBy = "consumer")
    private List<Order> orders;
}
