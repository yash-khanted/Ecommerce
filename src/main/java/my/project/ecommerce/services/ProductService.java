package my.project.ecommerce.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import my.project.ecommerce.models.Product;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductJsonService implements IProductService {
    private Resource dataset;
    public ProductJsonService(){
        dataset = new ClassPathResource("ProductData.json");
    }
    @Override
    public List<Product> fetchAllProducts() {
        return new ArrayList<Product>();
    }

    @Override
    public Product fetchProduct(int id) {
        return null;
    }
}
