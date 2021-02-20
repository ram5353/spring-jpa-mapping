package com.learning.springjpamapping.repository;

import com.learning.springjpamapping.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
