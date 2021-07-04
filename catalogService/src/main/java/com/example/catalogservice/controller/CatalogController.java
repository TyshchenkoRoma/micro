package com.example.catalogservice.controller;

import com.example.catalogservice.entity.Product;
import com.example.catalogservice.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @GetMapping
    public Product getById(@RequestParam("uniqId") String uniqId) {

        return catalogService.getByUniqId(uniqId);
    }

    @GetMapping("/getBySku")
    public List<Product> getBySku(@RequestParam("sku") String sku) {

        return catalogService.getBySku(sku);
    }


}
