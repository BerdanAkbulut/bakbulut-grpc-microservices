package com.berdanakbulut.bakbulutorderservice.services.impl;

import com.berdanakbulut.bakbulut.order.lib.OrderRequest;
import com.berdanakbulut.bakbulutorderservice.entity.OrderEntity;
import com.berdanakbulut.bakbulutorderservice.repository.OrderRepository;
import com.berdanakbulut.bakbulutorderservice.services.intf.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    @Override
    public UUID placeOrder(OrderRequest orderRequest) {
        OrderEntity order= orderRepository.save(OrderEntity
                .builder()
                .status("PENDING")
                .products(orderRequest.getProducts())
                .customerId((long) orderRequest.getCustomerId())
                .isDeleted(Boolean.FALSE)
                .build());
        return order.getId();
    }
}
