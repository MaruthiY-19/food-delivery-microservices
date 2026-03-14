package com.fooddelivery.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fooddelivery.orderservice.entity.Order;
import com.fooddelivery.orderservice.repository.OrderRepository;
import com.fooddelivery.orderservice.feign.UserClient;
import com.fooddelivery.orderservice.feign.RestaurantClient;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final UserClient userClient;
    private final RestaurantClient restaurantClient;

    public OrderService(OrderRepository orderRepository,
                        UserClient userClient,
                        RestaurantClient restaurantClient) {
        this.orderRepository = orderRepository;
        this.userClient = userClient;
        this.restaurantClient = restaurantClient;
    }

    @CircuitBreaker(name = "orderService", fallbackMethod = "fallbackOrder")
    public Order createOrder(Order order) {

        userClient.getUser(order.getUserId());

        restaurantClient.getRestaurant(order.getRestaurantId());

        order.setStatus("CREATED");

        return orderRepository.save(order);
    }

    public Order fallbackOrder(Order order, Exception ex) {

        order.setStatus("SERVICE_TEMPORARILY_UNAVAILABLE");

        return order;
    }
}