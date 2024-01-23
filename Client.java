import java.rmi.Naming;  

public class Client {  
   public static void main(String[] args) {  
      try {  
    	  IGreet stub = (IGreet) Naming.lookup("rmi://localhost:1900/greet");
    	  System.out.println(stub.printGreeting("user")); 
         
      } catch (Exception e) {
         System.err.println("Client exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
}
