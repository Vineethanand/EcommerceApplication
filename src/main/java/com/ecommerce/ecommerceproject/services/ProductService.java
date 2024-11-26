package com.ecommerce.ecommerceproject.services;

import com.ecommerce.ecommerceproject.exceptions.ProductNotFoundException;
import com.ecommerce.ecommerceproject.models.FakeStoreProduct;

import java.util.List;

public interface ProductService {
    public FakeStoreProduct getFakeStoreProductById(Long id) throws ProductNotFoundException;

    List<FakeStoreProduct> getFakeStoreProducts();

    FakeStoreProduct replaceFakeStoreProduct(Long id, FakeStoreProduct product);

    FakeStoreProduct createFakeStoreProduct(FakeStoreProduct product);

    FakeStoreProduct updateFakeStoreProduct(Long id, FakeStoreProduct product);
}
