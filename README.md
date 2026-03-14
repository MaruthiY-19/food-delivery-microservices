\# Food Delivery Microservices System



\## Overview



This project is a \*\*Food Delivery Backend System built using Microservices Architecture\*\* with Spring Boot and Spring Cloud.



The system consists of multiple independent services such as \*\*User Service, Restaurant Service, and Order Service\*\*, all connected through an \*\*API Gateway\*\* and registered with a \*\*Service Registry\*\*.



All services are containerized using Docker and orchestrated using Docker Compose.



---



\## Architecture



Client → API Gateway → Microservices



Microservices communicate with each other using REST APIs and are registered with Eureka Service Registry.



Configuration is managed centrally using Config Server.



---



\## Microservices



\### User Service



Handles user management operations.



\### Restaurant Service



Manages restaurant details and menu information.



\### Order Service



Processes food orders placed by users.



\### API Gateway



Acts as a single entry point for all client requests and routes them to the appropriate service.



\### Service Registry



Provides service discovery using Eureka Server.



\### Config Server



Centralized configuration management for all microservices.



---



\## Technologies Used



\### Backend



\* Java

\* Spring Boot



\### Microservices Tools



\* Spring Cloud Gateway

\* Spring Cloud Config Server

\* Eureka Server

\* OpenFeign



\### Observability



\* Zipkin Distributed Tracing



\### Database



\* MySQL



\### Containerization



\* Docker

\* Docker Compose



---



\## Project Structure



food-delivery-microservices

│

├── api-gateway

├── config-server

├── service-registry

├── user-service

├── restaurant-service

├── order-service

└── docker-compose



---



\## Running the Project



\### Start all services



```

docker compose up

```



\### Access API Gateway



```

http://localhost:8080

```



Example endpoints:



```

http://localhost:8080/users

http://localhost:8080/restaurants

http://localhost:8080/orders

```



---



\## Version 1 Features



\* Microservices architecture

\* Service discovery with Eureka

\* API Gateway routing

\* Centralized configuration

\* Distributed tracing with Zipkin

\* Docker containerization

\* Docker Compose orchestration



---



\## Future Improvements



Planned upgrades for the next versions:



\* JWT Authentication

\* Kubernetes Deployment

\* CI/CD Pipeline

\* Centralized Logging



---



\## Author



Maruthi Y

Backend Developer



