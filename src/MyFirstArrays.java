public class MyFirstArrays {

    public static void main(String[] args) {

        // array: platzhalter für mehrere Werte des "gleichen" Typs
        // -> array von int, array von double, array String

        // arrays haben eine definierte Länge!!!!
        // Platz muss vorher definiert werden

        // deklarieren
        // datentyp name = initialisierung
        String[] warenkorb = new String[4]; // 4 Strings haben Platz

        // initialisierung per Default-Wert
        // bei String -> null
        // bei int -> 0
        // bei double -> 0.0

        // Werte hinzufügen
        warenkorb[0] = "Apfel";
        warenkorb[1] = "Milch";
        warenkorb[2] = "Butter";
        warenkorb[3] = "Honig";

        // 2. Möglichkeit der Initialisierung
        String[] names = {"Max", "Susi", "John"};
        // 0 -> Max, 1 -> Susi, 2 -> John
        // Länge 3

        int[] noten = {1,2,3,4,5};
        // Länge: 4
        // höchster index: 3


        // Zugriff auf ein array
        // erfolgt über den index
        String produkt1 = warenkorb[0];
        String produkt2 = warenkorb[1];
        String produkt3 = warenkorb[2];
        String produkt4 = warenkorb[3];

        // Mittels Schleifen über ein Array iterieren

        // Wie lange soll meine Schleife laufen
        // Länge des Array wäre interessant
        // mittels array.length bekomme ich länge

        System.out.println("Länge: " + names.length);

        int lengthOfNames = names.length;

        for (int i = 0; i < names.length; i++) {
            // erster durchlauf -> names[0]
            // zweiter durchlauf -> names[1]
            // dritter durchlauf -> names[2]
            // vierter durchlauf -> names[???]
            String name = names[i];
            System.out.println(name);
        }
    }
}
