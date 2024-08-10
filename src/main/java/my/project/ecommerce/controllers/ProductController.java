package my.project.ecommerce.controllers;

import my.project.ecommerce.dto.ProductDto;
import my.project.ecommerce.models.Product;
import my.project.ecommerce.services.ProductService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts(@RequestParam int pageIndex, @RequestParam int offset){
        return ResponseEntity.ok(productService.fetchProducts(pageIndex, offset));
    }
    @GetMapping(path = "/{productId}")
    public HttpEntity<Product> getProduct(@PathVariable("productId") long productId){
        try{
            return new ResponseEntity<Product>(productService.fetchProduct(productId), HttpStatus.OK);
        }
        catch(Exception ex){
            return new ResponseEntity(ex, HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping
    public void updateProduct(@RequestBody ProductDto productUpdateRequestDto){}
    @DeleteMapping(path = "/{productId}")
    public void deleteProduct(@PathVariable("productId") Long ProductId){}
}
