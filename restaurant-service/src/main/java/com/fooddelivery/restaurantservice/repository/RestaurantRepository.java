package com.fooddelivery.restaurantservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fooddelivery.restaurantservice.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}