package com.ecommerce.ecommerceproject.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FakeStoreProductDto {
     Long id;
     String title;
     Double price;
     String description;
     String category;
}
