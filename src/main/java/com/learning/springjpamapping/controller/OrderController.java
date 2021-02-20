package com.learning.springjpamapping.controller;


import com.learning.springjpamapping.dto.OrderRequestDTO;
import com.learning.springjpamapping.dto.OrderResponseDTO;
import com.learning.springjpamapping.entity.Customer;
import com.learning.springjpamapping.repository.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {


    private CustomerRepository customerRepository;

    public OrderController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @PostMapping("/placeOrder")
    private Customer placeOrder(@RequestBody OrderRequestDTO orderRequestDTO) {
        return customerRepository.save(orderRequestDTO.getCustomer());
    }

    @GetMapping("/orders")
    private List<Customer> findAllOrders() {
        return customerRepository.findAll();
    }

    @GetMapping("/joinOrders")
    private List<OrderResponseDTO> getJoinInfo() {
        return customerRepository.joinInformation();
    }



}
