package com.example.inventoryservice.service;

import com.example.inventoryservice.entity.Inventory;

import java.util.List;

public interface InventoryService {

    List<Inventory> getByUniqId();

    void fillRandomAvailability();

    List<Inventory> getListInventory(List<String> idList);
}
