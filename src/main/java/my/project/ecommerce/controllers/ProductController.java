package my.project.ecommerce.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import my.project.ecommerce.dto.ProductRequestDto;
import my.project.ecommerce.dto.ProductResponseDto;
import my.project.ecommerce.models.BaseModel;
import my.project.ecommerce.models.Product;
import my.project.ecommerce.services.IProductService;
import my.project.ecommerce.services.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    //default, we will use the mysql product service
    private IProductService productService;
    private ObjectMapper objectMapper;

    public ProductController(IProductService productService, ObjectMapper objectMapper) {
        this.productService = productService;
        this.objectMapper = objectMapper;
    }

    @GetMapping
    public void getAllProducts(@RequestParam int pageIndex, @RequestParam int offset){
        return;
    }

    @GetMapping(path = "/{productId}")
    public void getProduct(@PathVariable("productId") Long productId){
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void postProduct(@RequestBody Product product){
        productService.saveProduct(product);
    }
    @PutMapping
    public void updateProduct(@RequestBody ProductRequestDto productUpdateRequestDto){}
    @DeleteMapping(path = "/{productId}")
    public void deleteProduct(@PathVariable("productId") Long ProductId){

    }
}
