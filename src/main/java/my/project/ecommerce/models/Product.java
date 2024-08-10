package my.project.ecommerce.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
@Data
@Entity(name = "product")
public class Product extends BaseModel {
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private ProductCategory category;
    @ElementCollection
    @CollectionTable(name = "product_images",
            joinColumns = @JoinColumn(name = "product_id"))
    @Column(name = "image_uri")
    private Set<String> images;
    private String manufacturer;
    @ElementCollection
    @CollectionTable(name = "product_specifications",
            joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"))
    @MapKeyColumn(name = "product_specification")
    @Column(name = "specification_value")
    private Map<String, String> specifications;
}
