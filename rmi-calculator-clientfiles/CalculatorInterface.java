import java.rmi.*;

public interface CalculatorInterface extends Remote{
	public int add(int a, int b) throws RemoteException;
                public int subtract(int a, int b) throws RemoteException;
                public double multiply(int a, int b) throws RemoteException;
                public double divide(int a, int b) throws RemoteException;
}