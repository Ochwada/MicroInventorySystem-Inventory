package com.ochwada.inventoryservice.repository;


import com.ochwada.inventoryservice.model.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

/**
 * *******************************************************
 * Package: com.ochwada.inventoryservice.repository
 * File: InventoryRepository.java
 * Author: Ochwada
 * Date: Wednesday, 30.Jul.2025, 12:06 PM
 * Description: MongoDB repository for inventory records.
 * Objective:
 * *******************************************************
 */


public interface InventoryRepository extends MongoRepository<Inventory, String> {

    /**
     * Finds inventory by product ID.
     *
     * @param productId the ID of the product
     * @return an optional inventory record
     */
    Optional<Inventory> findByProductId(Long productId);
}
