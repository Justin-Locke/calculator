import java.util.Scanner;

public class App {
    double lastNumber;
    double answer;
    double lastAnswer;

    public static void main(String[] args) {
        Calculator brains = new Calculator();
        System.out.println("Hello, World!");
        App firstCalc = new App();
        firstCalc.clearScreen();

        // double answer;
        // double lastAnswer;

        double num1 = getDouble("Enter a Double");
        firstCalc.clearScreen();
        System.out.println("First digit is : " + num1);

        String operatorChoice = getString("Which operation would you like to perform? (+, -, *, /)");
        firstCalc.clearScreen();

        int attempts = 5;

        while (!operatorChoice.equals("+") && !operatorChoice.equals("-") && !operatorChoice.equals("*") && attempts > 0){

            System.out.println("Attempts left: " + attempts);
            System.out.println("First digit is : " + num1);

            if (!operatorChoice.equals("+") || !operatorChoice.equals("-") || !operatorChoice.equals("*")
                    || !operatorChoice.equals("/")) {
                System.out.println("Please choose from this selection: (+, -, *, /)");
                operatorChoice = getString("Which operation would you like to perform? (+, -, *, /)");
                attempts -= 1;
                firstCalc.clearScreen();
            } else {
                System.out.println("First digit is : " + num1);
                System.out.println("Operation type is : " + operatorChoice);
            }
            
        }
        if (attempts == 0) {
            System.out.println("Are you goofin?");
            System.exit(attempts);

        }
        
        double num2 = getDouble("Enter another Double");
        firstCalc.clearScreen();
        System.out.println("First digit is : " + num1);
        System.out.println("Operation type is : " + operatorChoice);
        System.out.println("Second number is : " + num2);

        if (operatorChoice.equals("+")) {
            firstCalc.answer = brains.add(num1, num2);
            System.out.println(num1 + " plus " + num2 + " is " + firstCalc.answer);

        } else if (operatorChoice.equals("-")) {
            firstCalc.answer = brains.subtract(num1, num2);
            System.out.println(num1 + " minus " + num2 + " is " + firstCalc.answer);

        } else if (operatorChoice.equals("*")) {
            firstCalc.answer = brains.multiply(num1, num2);
            System.out.println(num1 + " multiplied by " + num2 + " is " + firstCalc.answer);

        } else if (operatorChoice.equals("/") && num2 != 0) {
            firstCalc.answer = brains.divide(num1, num2);
            System.out.println(num1 + " divided by " + num2 + " is " + firstCalc.answer);

        } else if (operatorChoice.equals("/") && num2 == 0) {
            System.out.println("Can't divide by zero.");
        }

        String response = getString("Would you like to continue? y/n: ");

        while (response.equals("y")) {
            String questionAboutLastAnswer = getString("Do you want to continue with your last answer? y/n");
            firstCalc.clearScreen();
            if (questionAboutLastAnswer.equals("y")) {
                firstCalc.lastAnswer = firstCalc.answer;
                num1 = firstCalc.lastAnswer;
                System.out.println("First Double is " + num1);
            } else {

                num1 = getDouble("Enter a Double");
                System.out.println("First Double is " + num1);
            }
            operatorChoice = getString("Which operation would you like to perform? (+, -, *, /)");

            num2 = getDouble("Enter a second Double");

            if (operatorChoice.equals("+")) {
                double additionResult = brains.add(num1, num2);
                System.out.println(num1 + " plus " + num2 + " is " + additionResult);
            } else if (operatorChoice.equals("-")) {
                double subtractionResult = brains.subtract(num1, num2);
                System.out.println(num1 + " minus " + num2 + " is " + subtractionResult);
            } else if (operatorChoice.equals("*")) {
                double multiplicationResult = brains.multiply(num1, num2);
                System.out.println(num1 + " multiplied by " + num2 + " is " + multiplicationResult);
            } else if (operatorChoice.equals("/") && num2 != 0) {
                double divisionResult = brains.divide(num1, num2);
                System.out.println(num1 + " divided by " + num2 + " is " + divisionResult);
            } else if (operatorChoice.equals("/") && num2 == 0) {
                System.out.println("Can't divide by zero.");
            }

            response = getString("Would you like to continue? y/n: ");

        }

        System.out.println("goodbye");

    }

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

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
    }

}