package com.berdanakbulut.bakbulutorderservice.repository;

import com.berdanakbulut.bakbulutorderservice.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<OrderEntity, UUID> {}
