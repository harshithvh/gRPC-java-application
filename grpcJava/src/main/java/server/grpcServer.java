package server;

import java.io.IOException;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import api.PurchaseTicket;
import api.AllocateSeat;
import api.ShowReceipt;
import api.GetUsersBySection;
import api.RemoveUser;
import api.ModifySeat;

public class grpcServer {

    public static void main(String args[]) throws IOException, InterruptedException {

        int port = 9090; // Change the port to an available port

        System.out.println("Starting GRPC Server");
        Server server = ServerBuilder.forPort(port)
                .addService(new PurchaseTicket())
                .addService(new AllocateSeat())
                .addService(new ShowReceipt())
                .addService(new GetUsersBySection())
                .addService(new RemoveUser())
                .addService(new ModifySeat())
                .build();

        server.start();
        System.out.println("Server started at port " + port);
        server.awaitTermination();
    }
}
