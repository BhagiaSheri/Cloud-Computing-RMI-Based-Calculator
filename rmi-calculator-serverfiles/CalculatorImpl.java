import java.rmi.*;
import java.rmi.server.*;

public class CalculatorImpl extends UnicastRemoteObject implements CalculatorInterface{
	
	public CalculatorImpl() throws RemoteException{}

                //add two numbers
	public int add(int a, int b) throws RemoteException{
                          int sum = a+b;
                          return sum;
                }
                
                //subtract two numbers
	public int subtract(int a, int b) throws RemoteException{
                          int subtraction = a-b;
                          return subtraction;
                }
                
                //multiplication of two numbers
	public double multiply(int a, int b) throws RemoteException{
                          double multiplication = a*b;
                          return multiplication;
                }

                //perform division of two numbers
	public double divide(int a, int b) throws RemoteException{
                          double division = a / b;
                          return division;
                }
}