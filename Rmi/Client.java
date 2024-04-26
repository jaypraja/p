import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client{
    public static void main(String[]  args){
        try{
            Registry registry=LocateRegistry.getRegistry(1099);
            RMI_Interface obj=(RMI_Interface) registry.lookup("HelloServer");
            int message  - = obj.sum(30,20);
            System.out.println("Message from server: "+message);
        }
        catch (Exception e) {
            System.out.println("Client Exception "+ e.toString());
        }
    }
}

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Client{
    public ststic void main(String[] args){
        try{
            Registry registry=LocateRegistry.getRegistry(1099);
            RMI_Interface obj=(RMI_Interfae) registry.lookup("hello");
            int message-=obj.sum(30,20);
            System.out.println("message from server"+message);
        }
        catch(Exception e){
            System.out.println("client exception"+e.toString());
        }
    }
}
