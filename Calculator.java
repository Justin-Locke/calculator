public class Calculator {

    public static double add(double a, double b) {
        double addResult = a + b;
        //System.out.println(a + " plus " + b + " equals " + addResult);
        return addResult;
    }
    
    public static double subtract(double a, double b) {
        double subtractResult = a - b;
        //System.out.println(a + " minus " + b + " equals " + subtractResult);
        return subtractResult;
    }
    public static double multiply(double a, double b) {
        double multiplyResult = a * b;
        //System.out.println(a + " multiplied by " + b + " equals " + multiplyResult);
        return multiplyResult;
    }
    public static double divide(double a, double b) {
        double divideResult = a / b;
        
        //System.out.println(a + " divided by " + b + " equals " + divideResult);
        return divideResult;
    }

    public static double answer(double a) {
        return a;
    }
}
