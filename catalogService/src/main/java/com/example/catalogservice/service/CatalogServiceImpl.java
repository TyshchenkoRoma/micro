package com.example.catalogservice.service;

import com.example.catalogservice.entity.Product;
import com.example.catalogservice.repository.ProductRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product getByUniqId(String uniqId) {

       return productRepository.findByUniq_id(uniqId);
    }

    @Override
    public List<Product> getBySku(String sku) {
        return productRepository.findBySku( sku);
    }
}
