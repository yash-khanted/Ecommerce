package my.project.ecommerce.services;

import my.project.ecommerce.dto.ProductDto;
import my.project.ecommerce.models.Product;
import my.project.ecommerce.models.ProductCategory;

import java.util.List;

public interface IProductService {
    //save method
    Product saveProduct(ProductDto productDto);
    //read Method
    List<Product> fetchProducts(int pageIndex, int offset);
    Product fetchProduct(long productId);

    //update method
    Product updateProduct(long productId, Product updatedObject);

    //delete method
    void deleteProduct(long productId);
}
