package com.product.productservice.services;

import com.product.productservice.exceptions.ProductNotFoundException;
import com.product.productservice.models.FakeStoreProduct;

import java.util.List;

public interface ProductService {
    public FakeStoreProduct getFakeStoreProductById(Long id) throws ProductNotFoundException;

    List<FakeStoreProduct> getFakeStoreProducts();

    FakeStoreProduct replaceFakeStoreProduct(Long id, FakeStoreProduct product);

    FakeStoreProduct createFakeStoreProduct(FakeStoreProduct product);

    FakeStoreProduct updateFakeStoreProduct(Long id, FakeStoreProduct product);
}
