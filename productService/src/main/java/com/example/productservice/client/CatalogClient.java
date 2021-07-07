package com.example.productservice.client;

import com.example.productservice.dto.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(url = "http://localhost:8080", name = "catalog")
public interface CatalogClient {

    @GetMapping("/catalog/byid")
    Product getByUniqId(@RequestParam("uniqId") String uniqId);

    @GetMapping("/catalog/getbysku")
    List<Product> getBySku(@RequestParam("sku") String sku);
}
