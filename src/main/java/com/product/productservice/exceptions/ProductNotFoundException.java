package com.product.productservice.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductNotFoundException extends Exception{
    private Long error_code;
    public ProductNotFoundException(Long err_code, String message) {
        super(message);
        this.error_code = err_code;
    }
}
