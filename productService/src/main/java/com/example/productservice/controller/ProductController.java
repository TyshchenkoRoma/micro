package com.example.productservice.controller;

import com.example.productservice.client.CatalogClient;
import com.example.productservice.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    CatalogClient catalogClient;

    @GetMapping
    public Product getById(@RequestParam("uniqId") String uniqId) {
       return catalogClient.getByUniqId(uniqId);
    }
}
