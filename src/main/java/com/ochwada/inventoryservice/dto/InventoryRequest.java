package com.ochwada.inventoryservice.dto;


/**
 * *******************************************************
 * Package: com.ochwada.inventoryservice.dto
 * File: InventoryRequest.java
 * Author: Ochwada
 * Date: Wednesday, 30.Jul.2025, 12:20 PM
 * Description:
 * Objective:
 * *******************************************************
 */


public record InventoryRequest(Long productId, int quantity) {
}
