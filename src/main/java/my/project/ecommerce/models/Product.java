package my.project.ecommerce.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Product {
    private int id;
    private String title;
    private double price;
    private String category;
    private String description;
    private String image;
}
