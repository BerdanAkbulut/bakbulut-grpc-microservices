package com.berdanakbulut.bakbulutorderservice.services.intf;

import com.berdanakbulut.bakbulut.order.lib.OrderRequest;

import java.util.UUID;

public interface OrderService {
    UUID placeOrder(OrderRequest orderRequest);
}
