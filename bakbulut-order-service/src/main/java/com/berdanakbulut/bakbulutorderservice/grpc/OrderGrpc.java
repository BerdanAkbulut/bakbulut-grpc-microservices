package com.berdanakbulut.bakbulutorderservice.grpc;

import com.berdanakbulut.bakbulut.order.lib.OrderRequest;
import com.berdanakbulut.bakbulut.order.lib.OrderResponse;
import com.berdanakbulut.bakbulut.order.lib.OrderServiceGrpc;
import com.berdanakbulut.bakbulutorderservice.services.intf.OrderService;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.UUID;

@GrpcService
@Slf4j
@RequiredArgsConstructor
public class OrderGrpc extends OrderServiceGrpc.OrderServiceImplBase {

    private final OrderService orderService;
    @Override
    public void placeOrder(OrderRequest request, StreamObserver<OrderResponse> responseObserver) {
        UUID id = orderService.placeOrder(request);
        responseObserver.onNext(OrderResponse.newBuilder().setId(id.toString()).build());
        responseObserver.onCompleted();
    }
}
