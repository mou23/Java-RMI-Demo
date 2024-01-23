import java.rmi.Naming;

public class Server { 
   public static void main(String args[]) { 
      try { 
         Greeter greeter = new Greeter(); 
         Naming.rebind("rmi://localhost:1900/greet",greeter);
         System.err.println("Server ready"); 
      } catch (Exception e) { 
         System.err.println("Server exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
} 