package my.project.ecommerce.services;

import my.project.ecommerce.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductRestService implements IProductService{
    @Override
    public List<Product> fetchAllProducts() {
        List<Product> products = null;

        return products;
    }

    @Override
    public Product fetchProduct(int id) {
        return new Product();
    }
}
