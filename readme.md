<h1>SPRING BOOT - GRPC - MICROSERVICE</h1>

# COMMANDS
---------------
brew install grpcurl  // for installing grpc shell client

grpcurl --plaintext localhost:9090 list // listing grpc services

grpcurl --plaintext -d '{"products": "product1, product2", "customerId": 1}' localhost:9090 com.berdanakbulut.bakbulut.order.OrderService/PlaceOrder // sending request to service endpoint
