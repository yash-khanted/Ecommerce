package my.project.ecommerce.controllers;

import my.project.ecommerce.dto.ProductResponse;
import my.project.ecommerce.models.Product;
import my.project.ecommerce.services.ProductJsonService;
import my.project.ecommerce.services.ProductRestService;
import my.project.ecommerce.utilities.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    ProductJsonService productService;
    ProductRestService productRestService;
    Mapper mapper;
    @Autowired
    public ProductController(ProductJsonService productService, ProductRestService productRestService, Mapper mapper){
        this.productService = productService;
        this.productRestService = productRestService;
        this.mapper = mapper;
    }
    @GetMapping
    public List<ProductResponse> getAllProducts(){
        List<ProductResponse> responses = null;
        try{
           List<Product> products = productService.fetchAllProducts();

           for(Product product: products){
               responses.add(mapper.mapProductsToResponse(product));
           }
       }
       catch(NullPointerException ex){
           ex.getMessage();
       }

        return responses;
    }

    @GetMapping(path = "/fakestore")
    public List<Product> fetchProductsFromApi(){
        return productRestService.fetchAllProducts();
    }
}
