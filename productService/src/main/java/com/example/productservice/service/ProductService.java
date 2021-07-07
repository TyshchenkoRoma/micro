package com.example.productservice.service;


import com.example.productservice.dto.Inventory;
import com.example.productservice.dto.Product;

import java.util.List;

public interface ProductService {

    List <String> getAvailId(List <String> id);

    List <String> getAvailId(String sku);
}
