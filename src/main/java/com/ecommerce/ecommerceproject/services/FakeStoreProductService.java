package com.ecommerce.ecommerceproject.services;

import com.ecommerce.ecommerceproject.models.FakeStoreProduct;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductService implements ProductService{

    RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public FakeStoreProduct getFakeStoreProductById(Long id) {
        return null;
    }
}
