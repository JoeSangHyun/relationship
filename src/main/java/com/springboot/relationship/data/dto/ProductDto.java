package com.springboot.relationship.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ProductDto {

    private String name;
    private int price;
    private int stock;
}
