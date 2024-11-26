package com.ecommerce.ecommerceproject.controllers;

import com.ecommerce.ecommerceproject.dtos.FakeStoreProductDto;
import com.ecommerce.ecommerceproject.exceptions.ProductNotFoundException;
import com.ecommerce.ecommerceproject.models.FakeStoreProduct;
import com.ecommerce.ecommerceproject.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<FakeStoreProduct> getFakeStoreProductById(@PathVariable Long id) throws ProductNotFoundException {
        FakeStoreProduct product = productService.getFakeStoreProductById(id);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping("/")
    public List<FakeStoreProduct> getFakeStoreProducts() {
        return productService.getFakeStoreProducts();
    }

    @PutMapping("/{id}")
    public FakeStoreProduct replaceFakeStoreProduct(@PathVariable Long id, @RequestBody FakeStoreProduct product) {
        return productService.replaceFakeStoreProduct(id, product);
    }

    @PostMapping("/")
    public ResponseEntity<FakeStoreProduct> createFakeStoreProduct(@RequestBody FakeStoreProduct product) {
        FakeStoreProduct fakeStoreProduct = productService.createFakeStoreProduct(product);
        return new ResponseEntity<>(fakeStoreProduct, HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<FakeStoreProduct> updateFakeStoreProduct(@PathVariable Long id, @RequestBody FakeStoreProduct product) {
        FakeStoreProduct fakeStoreProduct = productService.updateFakeStoreProduct(id, product);
        return new ResponseEntity<>(fakeStoreProduct, HttpStatus.OK);
    }
}
