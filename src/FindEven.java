public class FindEven {

    public static void main(String[] args) {

        // gebe startpunkt der schleife
        int count = 0; // initialize
        // wie lange laufen wir -> bis wir 10 (inkl.) erreicht haben

        // solange mein start (count) kleiner gleich 10 ist
        while (count <= 10) { // terminate -> bedingung
            // prüfe ob der count (wert) gerade ist -> verwende modulo
            if (count % 2 == 0) {
                // wenn gerade, auf der Konsole ausgeben
                System.out.println("Gerade Zahl: " + count);
            }
            // count um 1 erhöhen
            count++; // !!!!!! modification
        }
    }
}
