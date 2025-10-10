public class SchleifenDemo {

    public static void main(String[] args) {

        int i = 0;

        while(i <= 10) {
            i++;
            if (i % 2 != 0) {
                //continue; // prüfe die bedingung erneut
               // break;
                return;
                //System.out.println("nach break innerhalb der while");

            }

            System.out.println(i);
        }

        System.out.println("nach break");
        System.out.println("nach return");
    }

    public static int returnHallo() {

        System.out.println("in return Hallo");
        return 0;
    }
}
