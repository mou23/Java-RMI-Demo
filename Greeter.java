import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Greeter extends UnicastRemoteObject implements IGreet {  
   
   protected Greeter() throws RemoteException {
		super();
	}

   public String printGreeting(String name) {  
      return ("Hello "+name);  
   }  
}