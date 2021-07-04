package com.example.catalogservice.service;

import com.example.catalogservice.entity.Product;

public interface CatalogService {
    Product getByUniqId(String uniqId);
}
