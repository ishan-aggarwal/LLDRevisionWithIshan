package com.ishan.fakestore.services;

import com.ishan.fakestore.models.Category;
import com.ishan.fakestore.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product getProductById(Long id);

    List<Product> getProductsLimited(int limit);

    List<Product> getProductsSorted(String sort);

    List<Category> getAllCategories();

    List<Product> getProductsByCategory(String category);

    Product addProduct(Product product);

    Product updateProduct(Long id, Product product);

    void deleteProduct(Long id);
}