package com.ecommerce.ecommerceproject.controllers;

import com.ecommerce.ecommerceproject.models.FakeStoreProduct;
import com.ecommerce.ecommerceproject.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/{id}")
    public FakeStoreProduct getFakeStoreProductById(@PathVariable Long id) {
        return productService.getFakeStoreProductById(id);
    }
}
