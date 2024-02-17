package my.project.ecommerce.services;

import my.project.ecommerce.models.Product;

import java.util.List;

interface IProductService {
    List<Product> fetchAllProducts();
    Product fetchProduct(int id);
}
