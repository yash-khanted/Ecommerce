package my.project.ecommerce.services;

import my.project.ecommerce.dao.implementations.ProdcutDao;
import my.project.ecommerce.dao.interfaces.IProductDao;
import my.project.ecommerce.models.Product;
import my.project.ecommerce.repositories.IProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    private final IProductDao productDao;

    public ProductService(ProdcutDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public Product saveProduct(Product product) {
        return productDao.save(product);
    }

    @Override
    public List<Product> fetchProducts(int pageIndex, int offset) {
        List<Product> products = productDao.findAllProducts(PageRequest.of(pageIndex, offset));
        return products;
    }

    @Override
    public Product fetchProduct(long productId) {
        return null;
    }

    @Override
    public Product updateProduct(long productId, Product updatedObject) {
        return null;
    }

    @Override
    public void deleteProduct(long productId) {
        return;
    }
}
