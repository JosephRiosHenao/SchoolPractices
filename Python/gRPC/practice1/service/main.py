import grpc
import grpc_tools

from concurrent import futures

import payment_pb2
import payment_pb2_grpc


def main():
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    server.add_insecure_port('[::]:50051')
    
    payment_pb2_grpc.add_ServicePaymentServicer_to_server(payment_pb2_grpc.ServicePayment(), server)
    
    server.start() 
    print("Server up! ")
    server.wait_for_termination()
    
if __name__ == "__main__":
    main()