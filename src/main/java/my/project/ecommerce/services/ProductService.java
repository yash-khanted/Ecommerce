package my.project.ecommerce.services;

import my.project.ecommerce.dao.implementations.ProductDao;
import my.project.ecommerce.dao.interfaces.IProductDao;
import my.project.ecommerce.dto.ProductDto;
import my.project.ecommerce.converters.ProductMapper;
import my.project.ecommerce.models.Product;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    private final IProductDao productDao;
    private ProductMapper mapper;

    public ProductService(ProductDao productDao, ProductMapper mapper) {
        this.productDao = productDao;
        this.mapper = mapper;
    }

    @Override
    public long saveProduct(Product product) {
        return productDao.save(product).getId();
    }

    @Override
    public List<Product> fetchProducts(int pageIndex, int offset) {
        return productDao.findAllProducts(PageRequest.of(pageIndex, offset));
    }

    @Override
    public Product fetchProduct(long id) throws NullPointerException {
        return productDao.findById(id);
    }

    @Override
    public Product updateProduct(long productId, Product updatedObject) {
        return null;
    }

    @Override
    public void deleteProduct(long productId) {
        return;
    }

    public long saveProduct(ProductDto productDto){
        return productDao.save(mapper.toEntity(productDto)).getId();
    }
}
