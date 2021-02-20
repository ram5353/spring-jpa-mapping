package com.learning.springjpamapping.dto;


import com.learning.springjpamapping.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequestDTO {
    private Customer customer;
}
