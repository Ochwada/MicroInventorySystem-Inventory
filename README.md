# 📦 MicroInventorySystem-Inventory
## Microservice 2: Inventory Service - Overview

This is the Inventory Service, a core component in a microservices-based inventory system responsible for managing 
product stock levels. It handles inventory creation, updates, and retrieval of stock quantities. The service exposes 
RESTful endpoints that allow other microservices—such as the Product Service—to fetch real-time inventory data and 
ensure availability before processing operations like order placement or stock checks.

## 📦 Features
Create and initialize inventory for new products

Retrieve available stock quantity by product ID

Update inventory after stock changes (optional for extensions)

RESTful API with Spring Boot

Clean separation of concerns using DTOs and service layers

Easy integration with other services (e.g., Product, Order)