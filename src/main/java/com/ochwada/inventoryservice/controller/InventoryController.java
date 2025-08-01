package com.ochwada.inventoryservice.controller;


import com.ochwada.inventoryservice.dto.InventoryRequest;
import com.ochwada.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


/**
 * *******************************************************
 * Package: com.ochwada.inventoryservice.controller
 * File: InventoryController.java
 * Author: Ochwada
 * Date: Wednesday, 30.Jul.2025, 12:17 PM
 * Description:REST controller for managing product inventory.
 * - Handles HTTP requests to retrieve and update stock quantities.
 * - Endpoints are exposed under the {@code /api/inventory} path.
 * *******************************************************
 */

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private  final InventoryService service;

    /**
     * Retrieves the current stock quantity for a given product ID.
     *
     * @param productId the ID of the product to look up
     * @return the available stock quantity (0 if not found)
     */
    @GetMapping("/{productId}")
    public int getStock(@PathVariable Long productId){
        return service.getStock(productId);
    }

    /**
     * Creates or updates the stock quantity for a given product.
     *
     * <p>If the product does not exist in the inventory, a new entry is created.</p>
     *
     * @param request an {@code InventoryRequest} containing the product ID and quantity
     */
    @PostMapping
    public void createOrUpdate(@RequestBody InventoryRequest request){
        service.createOrUpdateStock(request.productId(), request.quantity());
    }

}
