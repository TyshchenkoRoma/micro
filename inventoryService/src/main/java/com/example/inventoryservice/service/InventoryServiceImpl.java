package com.example.inventoryservice.service;

import com.example.inventoryservice.entity.Inventory;
import com.example.inventoryservice.repository.InventoryRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
@Getter
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    InventoryRepository inventoryRepository;

    @Override
    public List<Inventory> getByUniqId() {
        return inventoryRepository.findAllInventory();
    }

    @Override
    public void fillRandomAvailability() {
        List<String> uniqIdList = inventoryRepository.findAllUniqId();
        fillRandomAvailabilityByUniqId(uniqIdList);
    }

    @Override
    public List<Inventory> getListInventory(List<String> idList) {
        List< Inventory> invList = new ArrayList<>();
        for (String id: idList) {
         invList.add( inventoryRepository.findByUniq_id(id));
        }
        return invList;
    }

    private void fillRandomAvailabilityByUniqId(List<String> uniqIdList) {
        Inventory inventory;
        for (String id : uniqIdList) {
            inventory = inventoryRepository.findByUniq_id(id);
            inventory.setAvailable(new Random().nextBoolean());
            inventoryRepository.save(inventory);
        }
    }
}
