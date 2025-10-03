public class CalculatorExcercise {


    public static void main(String[] args) {
        // addieren, subtrahieren, multiplizieren und dividieren
        int number1 = 10;
        int number2 = 2;

        int result = add(number1, number2);
        printResult(number1, number2, result);

        result = subtract(number1, number2);
        printResult(number1, number2, result);

        result = multiply(number1, number2);
        printResult(number1, number2, result);

        double resultFromDivide = divide(number1, number2);
        System.out.println("resultFromDivide = " + resultFromDivide);
    }

    public static void printResult(int number1, int number2, int result) {
        System.out.println("Input 1 = " + number1);
        System.out.println("Input 2 = " + number2);
        System.out.println("Resultat = " + result);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return a / (b * 1.0);
    }

}
