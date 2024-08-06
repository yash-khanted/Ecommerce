package my.project.ecommerce.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Inventory extends BaseModel{
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Product product;
    private double purchasePrice;
    private double sellPrice;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;
}
