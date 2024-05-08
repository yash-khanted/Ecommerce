package my.project.ecommerce.services;

import my.project.ecommerce.dto.ProductRequestDto;
import my.project.ecommerce.models.Product;

import java.util.List;

public interface IProductService {
    //save method
    Product saveProduct(ProductRequestDto productRequestDto);

    //read Method
    List<Product> fetchProducts(int pageIndex, int offset);
    Product fetchProduct(long productId);

    //update method
    Product updateProduct(long productId, Product updatedObject);

    //delete method
    void deleteProduct(long produuctId);
}
