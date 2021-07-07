package com.example.productservice.service;

import com.example.productservice.client.CatalogClient;
import com.example.productservice.client.InventoryClient;
import com.example.productservice.dto.Inventory;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Getter
public class ProductServiceImpl implements ProductService {

    @Autowired
    InventoryClient inventoryClient;

    @Autowired
    CatalogClient catalogClient;

//    @Override
//    public List<Product> getAvailableProducts(List<Product> prodList, List<Inventory> invList) {
//
//        List<String> availableUniqIdLIst = invList.stream().filter(s -> s.getAvailable() == true)
//                .map(i -> i.getUniqId()).collect(Collectors.toList());
//        List<Product> avPrList = new ArrayList<>();
//        for (String id : availableUniqIdLIst) {
//            avPrList.add(prodList.stream().filter(s -> s.getId().equals(id)).findAny().get());
//        }
//
//        return avPrList;
//    }

    @Override
    public List <String> getAvailId(List <String> id) {
        List <String> avL = new ArrayList<>();

        List<Inventory> invList = new ArrayList<>();
        invList= inventoryClient.getListAvailability(id);


        avL = inventoryClient.getListAvailability(id).stream().filter(s->s.getAvailable()==true)
                .map(s->s.getUniqId()).collect(Collectors.toList());
        return avL;
    }

    @Override
    public List<String> getAvailId(String sku) {
        return catalogClient.getBySku(sku).stream().map(s->s.getUniqId()).collect(Collectors.toList());
    }
}
