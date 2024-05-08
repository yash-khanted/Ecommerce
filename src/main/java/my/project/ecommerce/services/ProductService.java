package my.project.ecommerce.services;

import my.project.ecommerce.dao.implementations.ProdcutDao;
import my.project.ecommerce.dao.interfaces.IProductDao;
import my.project.ecommerce.dto.ProductRequestDto;
import my.project.ecommerce.models.Inventory;
import my.project.ecommerce.models.Product;
import my.project.ecommerce.repositories.IProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.Destination;
import java.net.http.HttpClient;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService{
    private final IProductDao productDao;
    private final ModelMapper mapper;
    private final HttpClient httpClient;

    public ProductService(ProdcutDao productDao) {
        this.productDao = productDao;
        this.mapper = new ModelMapper();
        this.httpClient = HttpClient.newHttpClient();
    }

    /*
    * The productrequestdto is submitted by the seller and include details of the product its purchase details*/
    @Override
    public Product saveProduct(ProductRequestDto productRequestDto) {
        return productDao.save(new Product());
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
