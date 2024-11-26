package com.ecommerce.ecommerceproject.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductNotFoundException extends Exception{
    private Long error_code;
    public ProductNotFoundException(Long error_code, String message) {
        super(message);
        this.error_code = error_code;
    }
}
