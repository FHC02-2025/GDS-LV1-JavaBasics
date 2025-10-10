public class Noten {

    public static void main(String[] args) {

        // 1 Array
        // 5 Fächer
        // 5 Noten
        // Erstellen sie ein array mit Noten aus allen Fächern
        // geben sie anschließend alle Noten auf der Konsole aus

        // array mit noten initialisieren
        int[] noten = {1,1,2,1,2};

        // zugriff über for
        for (int i = 0; i < noten.length; i++) {
            System.out.println("Note: " + noten[i]);
        }

    }
}
