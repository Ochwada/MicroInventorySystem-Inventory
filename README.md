# 📦 MicroInventorySystem-Inventory
## Microservice 2: Inventory Service - Overview

This is the Inventory Service, a core component in a microservices-based inventory system responsible for managing 
product stock levels. It handles inventory creation, updates, and retrieval of stock quantities. The service exposes 
RESTful endpoints that allow other microservices—such as the Product Service—to fetch real-time inventory data and 
ensure availability before processing operations like order placement or stock checks.

## 📦 Features
- Store inventory documents (productId + quantity) in MongoDB 
- Retrieve stock quantity by productId 
- RESTful endpoints using Spring Boot 
- Clean architecture with DTOs and service layer 
- Uses MongoDB as a NoSQL backend for scalability and flexibility

## Tech Stack 
| Technology              | Purpose                                   |
|-------------------------|-------------------------------------------|
| **Java 17+**            | Main language                             |
| **Spring Boot**         | Application framework                     |
| **Spring Web**          | RESTful API development                   |
| **Spring Data MongoDB** | MongoDB integration for Spring            |
| **Lombok**              | Boilerplate reduction                     |
| **dotenv-java**         | Load environment variables from `.env`    |
| **MongoDB**             | NoSQL database for inventory records      |
| **Maven**               | Build and dependency management           |
| **Docker**              | Containerization for service and database |
