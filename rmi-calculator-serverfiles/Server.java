import java.rmi.*;
class Server {
	public static void main(String args[]){
		try{
			Naming.rebind("rmi://localhost/MyServer",new CalculatorImpl());
			System.out.println("Server is Ready to Perform Calculations!!!");
		}
		catch(Exception e){
			System.out.println("Calculator Server Failed: "+e);
		}
	}
}


