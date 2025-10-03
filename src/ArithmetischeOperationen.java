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


        // deklariert + initialisiert
        int eins = 1;

        System.out.println("eins = " + eins);
        // um eins erhöhen
        eins = eins + 1;
        System.out.println("eins = " + eins);

        eins++;
        System.out.println("eins = " + eins);
        // um 1 erhöhen
        eins += 1;

        System.out.println("eins = " + eins);

        ++eins;
        System.out.println("eins = " + eins);

        a = 1;
        int i = a++;
        System.out.println("i = " + i);

        i = ++a;
        System.out.println("i = " + i);

        i = (a++);
        System.out.println("i = " + i);

        double betrag = 100.0;
        betrag++;
        System.out.println("betrag = " + betrag);

        betrag += 1;
        System.out.println("betrag = " + betrag);

        betrag *= 4;
        System.out.println("betrag = " + betrag);

        betrag -= 50; // betrag = betrag - 50
        System.out.println("betrag = " + betrag);

        betrag--;
        System.out.println("betrag = " + betrag);


        // Vergleiche

        int x = 1;
        int y = 2;

        boolean res = x == y;
        System.out.println("res = " + res);


        String s1 = "Hallo";
        String s2 = "Hallo";

        System.out.println(s1 == s2);

        String s3 = new String("Hallo");
        String s4 = new String("Hallo");

        System.out.println(s3 == s4);


        boolean rainy = false;
        boolean sunny = true;
        boolean isSunday = true;

        boolean geheInPark = isSunday && sunny;
        boolean macheSparziergang = !rainy;

        boolean geheWirklichPark = ((100 >= 10) && geheInPark) || rainy;


    }
}
