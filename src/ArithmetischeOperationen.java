public class ArithmetischeOperationen {

    public static void main(String[] args) {


        // addieren -> +
        // subtrahieren -> -
        // multiplizieren -> *
        // dividieren -> /
        // modulo (Restwert) -> %

        int a = 5;
        int b = 3;

        double diff = a / (b * 1.0);

        System.out.println(a + b); // STRG + D -> duplizieren
        System.out.println("dividieren: " + (a - b)); // STRG + D -> duplizieren
        System.out.println(a * b); // STRG + D -> duplizieren
        System.out.println(a / b); // STRG + D -> duplizieren
        System.out.println(a % b); // STRG + D -> duplizieren

        System.out.println("diff = " + diff);

    }
}
