package my.project.ecommerce.services;

import my.project.ecommerce.dao.implementations.ProductDao;
import my.project.ecommerce.dao.interfaces.IProductDao;
import my.project.ecommerce.models.Inventory;
import my.project.ecommerce.models.Product;
import my.project.ecommerce.repositories.IProductRepository;
import org.springframework.data.domain.Page;
import my.project.ecommerce.dto.ProductDto;
import my.project.ecommerce.converters.ProductMapper;
import my.project.ecommerce.models.Product;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.Destination;
import java.net.http.HttpClient;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService{
    private final IProductDao productDao;
    private final HttpClient httpClient;
    private ProductMapper mapper;
    public ProductService(ProductDao productDao, ProductMapper mapper) {
        this.productDao = productDao;
        this.httpClient = HttpClient.newHttpClient();
        this.mapper = mapper;
    }

    @Override
    public Product saveProduct(ProductDto productDto) {
        return productDao.save(mapper.toEntity(productDto));
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
}
