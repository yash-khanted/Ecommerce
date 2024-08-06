package my.project.ecommerce.dao.implementations;

import my.project.ecommerce.dao.interfaces.IProductDao;
import my.project.ecommerce.models.Product;
import my.project.ecommerce.repositories.IProductRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ProductDao implements IProductDao {
    IProductRepository productRepository;

    public ProductDao(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAllProducts(Pageable pageable) {
        return productRepository.findAll(pageable).getContent();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public  Product findById(long id){
        return productRepository.findById(id).get();
    }
}
