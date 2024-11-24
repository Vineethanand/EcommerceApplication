package com.ecommerce.ecommerceproject.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProduct {
    Long id;
    String title;
    String description;
    Double price;
    FakeStoreCategory category;
}
