import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer extends UnicastRemoteObject implements RMIServerInterface {
    public RMIServer() throws RemoteException {
        super();
    }

    @Override
    public String getMessage() throws RemoteException {
        return "Hello from the RMI Server!";
    }

    public static void main(String[] args) {
        try {
            RMIServer server = new RMIServer();
            java.rmi.registry.LocateRegistry.createRegistry(1099); // Start RMI registry on port 1099
            java.rmi.Naming.rebind("RMIServer", server); // Bind the server object to the RMI registry
            System.out.println("Server started.");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}