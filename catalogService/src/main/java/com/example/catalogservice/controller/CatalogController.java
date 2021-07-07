package com.example.catalogservice.controller;

import com.example.catalogservice.entity.Product;
import com.example.catalogservice.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @GetMapping("/byid")
    public Product getById(@RequestParam("uniqId") String uniqId) {

        return catalogService.getByUniqId(uniqId);
    }

    @GetMapping("/getbysku")
    public List<Product> getBySku(@RequestParam("sku") String sku) {

        return catalogService.getBySku(sku);
    }


}
