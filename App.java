import java.util.Scanner;

public class App {
    double answer;
    double lastAnswer;

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        App firstCalc = new App();
        clearScreen();

        double num1 = getDouble("Enter a Double");
        clearScreen();
        System.out.println("First digit is : " + num1);

        String operatorChoice = getString("Which operation would you like to perform? (+, -, *, /)");
        clearScreen();

        int attempts = 5;

        while (!operatorChoice.equals("+") && !operatorChoice.equals("-") && !operatorChoice.equals("*")
                && attempts > 0) {

            System.out.println("Attempts left: " + attempts);
            System.out.println("First digit is : " + num1);

            System.out.println("Please choose from this selection: (+, -, *, /)");
            operatorChoice = getString("Which operation would you like to perform? (+, -, *, /)");
            attempts -= 1;
            clearScreen();

        }
        if (attempts == 0) {
            System.out.println("Are you goofin?");
            System.exit(attempts);

        }

        double num2 = getDouble("Enter another Double");
        clearScreen();
        System.out.println("First digit is : " + num1);
        System.out.println("Operation type is : " + operatorChoice);
        System.out.println("Second number is : " + num2);

        if (operatorChoice.equals("+")) {
            firstCalc.answer = Calculator.add(num1, num2);
            System.out.println(num1 + " plus " + num2 + " is " + firstCalc.answer);

        } else if (operatorChoice.equals("-")) {
            firstCalc.answer = Calculator.subtract(num1, num2);
            System.out.println(num1 + " minus " + num2 + " is " + firstCalc.answer);

        } else if (operatorChoice.equals("*")) {
            firstCalc.answer = Calculator.multiply(num1, num2);
            System.out.println(num1 + " multiplied by " + num2 + " is " + firstCalc.answer);

        } else if (operatorChoice.equals("/") && num2 != 0) {
            firstCalc.answer = Calculator.divide(num1, num2);
            System.out.println(num1 + " divided by " + num2 + " is " + firstCalc.answer);

        } else if (operatorChoice.equals("/")) {
            System.out.println("Can't divide by zero.");
        }

        String response = getString("Would you like to continue? y/n: ");

        while (response.equals("y")) {
            String questionAboutLastAnswer = getString("Do you want to continue with your last answer? y/n");
            clearScreen();
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
                double additionResult = Calculator.add(num1, num2);
                System.out.println(num1 + " plus " + num2 + " is " + additionResult);
            } else if (operatorChoice.equals("-")) {
                double subtractionResult = Calculator.subtract(num1, num2);
                System.out.println(num1 + " minus " + num2 + " is " + subtractionResult);
            } else if (operatorChoice.equals("*")) {
                double multiplicationResult = Calculator.multiply(num1, num2);
                System.out.println(num1 + " multiplied by " + num2 + " is " + multiplicationResult);
            } else if (operatorChoice.equals("/") && num2 != 0) {
                double divisionResult = Calculator.divide(num1, num2);
                System.out.println(num1 + " divided by " + num2 + " is " + divisionResult);
            } else if (operatorChoice.equals("/")) {
                System.out.println("Can't divide by zero.");
            }

            response = getString("Would you like to continue? y/n: ");

        }

        System.out.println("goodbye");

    }

    private static final Scanner inputScanner = new Scanner(System.in);

    private static String getString(String prompt) {
        System.out.println(prompt);
        return inputScanner.next();

    }

    private static double getDouble(String prompt) {
        System.out.println(prompt);
        return inputScanner.nextDouble();

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
    }

}