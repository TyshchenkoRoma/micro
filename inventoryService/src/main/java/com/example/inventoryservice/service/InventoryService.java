package com.example.inventoryservice.service;

import com.example.inventoryservice.entity.Inventory;

public interface InventoryService {

    Inventory getByUniqId(String uniqId);

    void fillRandomAvailability();
}
