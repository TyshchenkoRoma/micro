package com.example.catalogservice.repository;

import com.example.catalogservice.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends CrudRepository<Product, String> {
}
