public class DemoApp {

    public static void main(String[] args) {


        System.out.println("Hallo"); // STRG + D -> duplizieren
        System.out.println("Hallo"); // STRG + D -> duplizieren
        System.out.println("Hallo"); // STRG + D -> duplizieren
        System.out.println("Hallo"); // STRG + D -> duplizieren
        System.out.println("Hallo"); // STRG + D -> duplizieren
        System.out.println("Hallo"); // STRG + D -> duplizieren
        System.out.println("Hallo"); // STRG + D -> duplizieren
        System.out.println("Hallo"); // STRG + D -> duplizieren
        System.out.println("Hallo"); // STRG + D -> duplizieren
        System.out.println("Hallo"); // STRG + D -> duplizieren

        whileDemo(10);
        forDemo(5);

        System.out.println();
        for(int i = 20; i <= 90; i += 5) {
            System.out.println(i);
            // hier wird i um 5 erhöht
        }
    }

    public static void whileDemo(int end) {
        System.out.println("initaler wert: " + end);

        int count = 1;
        // wir starten bei 0 (count) und laufen bis end (ende)
        while (count <= end) {
            System.out.println("Hallo Zähler: " + count);
            count++; // zähler erhöhen
        }

        System.out.println("While Ende");
    }

    public static void forDemo(int end) {
        for (int i = 0; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}
