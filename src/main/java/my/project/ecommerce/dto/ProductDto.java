package my.project.ecommerce.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;
@Data
public class ProductDto {
    private String name;
    private String description;
    private double price;
}
