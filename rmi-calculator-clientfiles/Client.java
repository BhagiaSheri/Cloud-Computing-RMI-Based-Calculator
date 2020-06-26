    import java.rmi.*;
    import java.util.*;

       class Client {
       public static void main (String[] args) {
          CalculatorInterface cal;
          try {
              
             cal=(CalculatorInterface)Naming.lookup("rmi://localhost/MyServer"); 
               
            System.out.println("Arithematic Operations:");
            System.out.println("*******************************************************************");

           //User input for performing arithematic operations

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    	System.out.println("Enter Fisrt Number to Perform Arithematic Operations: ");
	int num1 = myObj.nextInt(); 
                System.out.println("Enter Second Number to Perform Arithematic Operations: ");
	int num2 = myObj.nextInt(); 

           System.out.println("***************************Results***********************************");
           System.out.println();
             
             //Calling all caculator remote functions
             System.out.println("Addition: "+cal.add(num1,num2));
             System.out.println("Subtraction: "+cal.subtract(num1,num2));
             System.out.println("Multiplication: "+cal.multiply(num1,num2));
             System.out.println("Division: "+cal.divide(num1,num2));
          }

          catch (Exception e){
             System.out.println("Hello Client Exception: " + e);
          }
       }
    }
