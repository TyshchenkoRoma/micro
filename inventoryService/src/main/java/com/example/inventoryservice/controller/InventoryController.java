package com.example.inventoryservice.controller;

import com.example.inventoryservice.entity.Inventory;
import com.example.inventoryservice.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

    @Autowired
    InventoryService inventoryService;

    @GetMapping
    Inventory getAvailability(@RequestParam("uniqId")  String uniqId) {
        inventoryService.fillRandomAvailability();
        return inventoryService.getByUniqId(uniqId);
    }
}

