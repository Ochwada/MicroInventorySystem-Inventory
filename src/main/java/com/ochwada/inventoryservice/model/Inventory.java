package com.ochwada.inventoryservice.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * *******************************************************
 * Package: com.ochwada.inventoryservice.model
 * File: Inventory.java
 * Author: Ochwada
 * Date: Wednesday, 30.Jul.2025, 12:03 PM
 * Description:
 * Objective:
 * *******************************************************
 */

@Document(collection = "inventories")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inventory {
    /** Unique identifier of the inventory record */
    @Id
    private String id;

    /** ID of the product (comes from product-service) */
    private Long productId;

    /** Current quantity in stock */
    private int quantity;

}
