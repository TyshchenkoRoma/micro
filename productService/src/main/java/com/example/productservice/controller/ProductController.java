package com.example.productservice.controller;

import com.example.productservice.client.CatalogClient;
import com.example.productservice.client.InventoryClient;
import com.example.productservice.dto.Inventory;
import com.example.productservice.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    CatalogClient catalogClient;

    @Autowired
    InventoryClient inventoryClient;

    @GetMapping("/cat")
    public Product getById(@RequestParam("uniqId") String uniqId) {
       return catalogClient.getByUniqId(uniqId);
    }

    @GetMapping("/catbysku")
    public List<Product> getBySku(@RequestParam("sku") String sku) {
        return catalogClient.getBySku(sku);
    }

    @GetMapping("/inv")
    public List<Inventory> getInventoryById() {
        return inventoryClient.getAvailability();
    }

    @GetMapping("/listinv")
    public List<Inventory> getInventoryById(@RequestParam("uniqIdList") List <String> uniqIdList) {
        return inventoryClient.getListAvailability(uniqIdList);
    }
}
