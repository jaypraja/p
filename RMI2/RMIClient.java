import java.rmi.Naming;

public class RMIClient {
    public static void main(String[] args) {
        try {
            RMIServerInterface server = (RMIServerInterface) Naming.lookup("//localhost/RMIServer"); // Lookup the server object
            String message = server.getMessage();
            System.out.println("Message from server: " + message);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}