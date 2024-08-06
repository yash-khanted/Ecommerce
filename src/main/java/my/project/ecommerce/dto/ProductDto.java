package my.project.ecommerce.dto;

import lombok.Data;

import java.util.Set;

@Data
public class ProductDto {
    private String name;
    private String description;
    private double price;
}
