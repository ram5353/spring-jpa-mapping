package com.learning.springjpamapping.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderResponseDTO {

    private String name;
    private String productName;
    private int price;
}
