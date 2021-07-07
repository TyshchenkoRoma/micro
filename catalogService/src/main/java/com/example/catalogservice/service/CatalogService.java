package com.example.catalogservice.service;

import com.example.catalogservice.entity.Product;

import java.util.List;

public interface CatalogService {

    Product getByUniqId(String uniqId);

    List<Product> getBySku(String sku);
}
