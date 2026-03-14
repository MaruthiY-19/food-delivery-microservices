package com.fooddelivery.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fooddelivery.userservice.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}