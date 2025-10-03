public class Calculator {


    // psvm
    public static void main(String[] args) {
        // variablen deklarieren und initialisieren
        int a = 2;
        int b;
        b = 3;
        int result;
        String name = "MyCalculator";

        result = a + b;

        // soutv + tab
        System.out.println("name = " + name);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("result = " + result);

        int res = 2 + 4;
        res = 4 + 6;

        a = 2;
        b = 4;
        res = add(a,b);  // add(2, 4);
    }

    public static int add(int a, int b) {
        int res = a + b;
        return res;
    }
}
