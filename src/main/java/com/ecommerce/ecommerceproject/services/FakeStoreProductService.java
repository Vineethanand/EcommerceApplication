package com.ecommerce.ecommerceproject.services;

import com.ecommerce.ecommerceproject.dtos.FakeStoreProductDto;
import com.ecommerce.ecommerceproject.models.FakeStoreCategory;
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

        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject("https://fakestoreapi.com/products/" + id, FakeStoreProductDto.class);
        return convertFakeStoreProductDtoToProduct(fakeStoreProductDto);
    }

    private FakeStoreProduct convertFakeStoreProductDtoToProduct(FakeStoreProductDto fakeStoreProductDto) {
        if (fakeStoreProductDto == null) {
            return null; // Handle null gracefully
        }

        FakeStoreProduct product = new FakeStoreProduct();
        product.setId(fakeStoreProductDto.getId());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setPrice(fakeStoreProductDto.getPrice());
        FakeStoreCategory category = new FakeStoreCategory();
        category.setTitle(fakeStoreProductDto.getCategory());
        product.setCategory(category);

        return product;
    }
}
