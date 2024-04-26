package my.project.ecommerce.utilities;

import my.project.ecommerce.dto.ProductResponse;
import my.project.ecommerce.models.Product;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public ProductResponse mapProductsToResponse(Product product){
        return new ProductResponse();
    }
}
