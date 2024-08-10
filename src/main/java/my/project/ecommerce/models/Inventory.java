package my.project.ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
public class Inventory extends BaseModel{
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Product product;
    private double purchasePrice;
    private int purchaseQuantity;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private User seller;
    private double sellPrice;
    private int quantity;
}
