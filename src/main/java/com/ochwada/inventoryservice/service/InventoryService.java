package com.ochwada.inventoryservice.service;


import com.ochwada.inventoryservice.model.Inventory;
import com.ochwada.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * *******************************************************
 * Package: com.ochwada.inventoryservice.service
 * File: InventoryService.java
 * Author: Ochwada
 * Date: Wednesday, 30.Jul.2025, 12:08 PM
 * Description:Service layer responsible for managing inventory data.
 * - Provides methods to retrieve and update stock quantities for products.
 * - Interacts with the {@link InventoryRepository} to persist and query inventory records.
 * *******************************************************
 */

@Service
@RequiredArgsConstructor
public class InventoryService {

    private  final InventoryRepository repository;

    public int getStock(Long productId){
        Optional<Inventory> inventory = repository.findByProductId(productId);

        return inventory.map(Inventory::getQuantity).orElse(0);
    }

    public void createOrUpdateStock(Long productId, int quantity){

        Inventory inventory = repository.findByProductId(productId)
                .orElse(new Inventory());

        inventory.setProductId(productId);
        inventory.setQuantity(quantity);

        repository.save(inventory);
    }

}
