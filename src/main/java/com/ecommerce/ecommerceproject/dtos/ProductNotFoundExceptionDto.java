package com.ecommerce.ecommerceproject.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductNotFoundExceptionDto {
    Long err_code;
    String err_msg;
}
