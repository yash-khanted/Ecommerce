package my.project.ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.service.annotation.GetExchange;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity(name = "seller")
public class Seller extends BaseModel implements Serializable {
    @OneToOne
    private User user;
    private String businessName;
    private String businessAddress;
    @OneToMany(mappedBy = "seller",
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE}
    )
    private List<Inventory> inventory;
    @OneToMany(mappedBy = "seller")
    private List<Order> orders;
}
