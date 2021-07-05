package com.example.inventoryservice.service;

import com.example.inventoryservice.entity.Inventory;
import com.example.inventoryservice.repository.InventoryRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@Getter
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    InventoryRepository inventoryRepository;

    @Override
    public Inventory getByUniqId(String uniqId) {
        return inventoryRepository.findByUniq_id(uniqId);
    }

    @Override
    public void fillRandomAvailability() {
        List<String> uniqIdList = inventoryRepository.findAllUniqId();
        fillRandomAvailabilityByUniqId(uniqIdList.get(0));
    }

    private Long fillRandomAvailabilityByUniqId(String uniqId) {
        Inventory inventory = inventoryRepository.findByUniq_id(uniqId);
        inventory.setAvailable(new Random().nextBoolean());
        inventoryRepository.save(inventory);
        return inventory.getId();
    }
}
