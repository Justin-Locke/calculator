import java.util.Scanner;

public class App {
    double lastNumber;
    public static void main(String[] args){
        Calculator brains = new Calculator();
        System.out.println("Hello, World!");
        
        double num1 = getDouble("Enter a Double");
        double num2 = getDouble("Enter another Double");
    
        String operatorChoice = getString("Which operation would you like to perform? (+, -, *, /)");

        if (operatorChoice.equals("+")) {
            System.out.println(num1 + " plus " + num2 + " is " + brains.add(num1, num2));
        }
        else if (operatorChoice.equals("-")) {
            System.out.println(num1 + " minus " + num2 + " is " + brains.subtract(num1, num2));
        }
        else if (operatorChoice.equals("*")) {
            System.out.println(num1 + " multiplied by " + num2 + " is " + brains.multiply(num1, num2));
        }
        else if (operatorChoice.equals("/") && num2 != 0) {
            System.out.println(num1 + " divided by " + num2 + " is " + brains.divide(num1, num2));
        }
        else if (operatorChoice.equals("/") && num2 == 0 ) {
            System.out.println("Can't divide by zero.");
        } 

        
        
        String response = getString("Would you like to continue? y/n: ");
       
        while (response.equals("y")) {        
            num1 = getDouble("Enter a Double");
            num2 = getDouble("Enter a second Double");
            operatorChoice = getString("Which operation would you like to perform? (+, -, *, /)");

            if (operatorChoice.equals("+")) {
                double additionResult = brains.add(num1, num2);
                System.out.println(num1 + " plus " + num2 + " is " + additionResult);
            }
            else if (operatorChoice.equals("-")) {
                double subtractionResult = brains.subtract(num1, num2);
                System.out.println(num1 + " minus " + num2 + " is " + subtractionResult);
            }
            else if (operatorChoice.equals("*")) {
                double multiplicationResult = brains.multiply(num1, num2);
                System.out.println(num1 + " multiplied by " + num2 + " is " + multiplicationResult);
            }
            else if (operatorChoice.equals("/") && num2 != 0) {
                double divisionResult = brains.divide(num1, num2);
                System.out.println(num1 + " divided by " + num2 + " is " + divisionResult);
            }
            else if (operatorChoice.equals("/") && num2 == 0 ) {
                System.out.println("Can't divide by zero.");
            } 
        
            response = getString("Would you like to continue? y/n: ");
            
        }
        
        System.out.println("goodbye");
            

            
        
    }
    // else {
    //     System.out.println("Goodbye");
    // }
        


    
       

    

    private static final Scanner inputScanner = new Scanner(System.in);

    private static String getString(String prompt) {
        System.out.println(prompt);
        String string = inputScanner.next();
        return string;


    }

    private static double getDouble(String prompt) {
        System.out.println(prompt);
        double number = inputScanner.nextDouble();
        return number;

    }

    // public static double getOperator(String prompt) {
    //     if (operatorChoice.equals("+")) {
    //         System.out.println(num1 + " plus " + num2 + " is " + brains.add(num1, num2));
    //     }
    //     else if (operatorChoice.equals("-")) {
    //         System.out.println(num1 + " minus " + num2 + " is " + brains.subtract(num1, num2));
    //     }
    //     else if (operatorChoice.equals("*")) {
    //         System.out.println(num1 + " multiplied by " + num2 + " is " + brains.multiply(num1, num2));
    //     }
    //     else if (operatorChoice.equals("/") && num2 != 0) {
    //         System.out.println(num1 + " divided by " + num2 + " is " + brains.divide(num1, num2));
    //     }
    //     else if (operatorChoice.equals("/") && num2 == 0 ) {
    //         System.out.println("Can't divide by zero.");
    //     } 
    // }
    

    
}