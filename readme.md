<h1>SPRING BOOT - GRPC - MICROSERVICE</h1>

# COMMANDS
---------------
brew install grpcurl

grpcurl --plaintext localhost:9090 list

grpcurl --plaintext -d '{"products": "product1, product2", "customerId": 1}' localhost:9090 com.berdanakbulut.bakbulut.order.OrderService/PlaceOrder
