package my.project.ecommerce.dao.interfaces;

import my.project.ecommerce.models.Product;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductDao {
    Product save(Product product);
    List<Product> findAllProducts(Pageable pageable);
    List<Product> findAllProducts();
    Product findById(long id);
}
