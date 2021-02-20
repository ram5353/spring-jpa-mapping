package com.learning.springjpamapping.repository;

import com.learning.springjpamapping.dto.OrderResponseDTO;
import com.learning.springjpamapping.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {


    @Query("SELECT new com.learning.springjpamapping.dto.OrderResponseDTO(c.name, p.productName, p.price) FROM Customer c join c.products p")
    public List<OrderResponseDTO> joinInformation();
}
