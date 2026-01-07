package server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class TimeServerMain {
    public static void main(String[] args) {
        try {
            // Start registry locally
            Registry registry = LocateRegistry.createRegistry(1099);

            // Bind server implementation directly
            TimeServerImpl server = new TimeServerImpl();
            registry.rebind("TimeServer", server);

            System.out.println("RMI registry started on port 1099");
            System.out.println("Time Server bound as 'TimeServer'");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
