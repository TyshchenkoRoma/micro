package com.example.inventoryservice.repository;

import com.example.inventoryservice.entity.Inventory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository extends CrudRepository<Inventory, String> {

    @Query(value = "select * from inventory where uniq_id = :uniqId", nativeQuery = true)
    Inventory findByUniq_id(@Param("uniqId") String uniqId);

    Inventory save(Inventory inventory);

    @Query(value = "select uniq_id from inventory", nativeQuery = true)
    List<String> findAllUniqId();
}
