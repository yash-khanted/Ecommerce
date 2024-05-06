package my.project.ecommerce.dto;

import lombok.Data;

import java.util.Set;

@Data
public class ProductRequestDto {
    private String name;
    private String description;
    private String category;
    private double price;
    private Set<String> images;
}
