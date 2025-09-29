public class VariablesDemo {

    public static void main(String[] args) {

        // Deklaration
        int a;
        boolean wahr;

        char c;

        int x,y,z;

        // initalisieren
        x = 2;
        z = 1;


        int res = x + z;
        System.out.println("res = " + res);
        // deklaration + initialieren

        int j = 4;
        int i = 3;
        int cal = i + j;

        // soutv + Tab
        System.out.println("cal = " + cal); // erwartet: 7


        // werte überschreiben
        i = 6;
        cal = i + j;
        System.out.println("cal = " + cal); // erwartet: 10

        //j = "Hallo";

        // Typumwandlung nicht möglich
        //String j = "Hallo";



    }
}
