package my.project.ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;
@Data
@Entity
@Table(name = "consumer_order")
public class Order extends BaseModel{
    @ElementCollection
    @CollectionTable(name = "order_product_map",
            joinColumns = @JoinColumn(name = "consumer_order_id"))
    @MapKeyColumn(name = "product_id")
    @Column(name = "ordered_quantity")
    private Map<Product, Integer> products;
    @Embedded
    private Address deliveryAddress;
    private double orderValue;
    private LocalDate expectedDeliveryDate;
    @Enumerated
    private OrderStatus orderStatus;
    private Consumer consumer;
    private Seller seller;
}
