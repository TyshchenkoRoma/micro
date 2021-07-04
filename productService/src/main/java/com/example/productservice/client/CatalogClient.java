package com.example.productservice.client;

import com.example.productservice.dto.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "http://localhost:8080", name = "catalog")
public interface CatalogClient {

    @GetMapping("/catalog")
    Product getByUniqId(@RequestParam("uniqId") String uniqId);
}
