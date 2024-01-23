import java.rmi.Remote; 
import java.rmi.RemoteException;  

public interface IGreet extends Remote {  
	public String printGreeting(String name) throws RemoteException;  
}