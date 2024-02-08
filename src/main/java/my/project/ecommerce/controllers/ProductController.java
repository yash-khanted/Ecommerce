package my.project.ecommerce.controllers;

import my.project.ecommerce.dto.ProductResponse;
import my.project.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    private HttpEntity<ProductResponse> response;
    @GetMapping
    public String getAll(){
       if(productService.fetchAllProducts()) return "True";
       return "false";
    }
}
