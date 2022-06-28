import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double boy , kilo ;

        Scanner inp = new Scanner (System.in);

        System.out.println("Boyunuzu girin:");
        boy = inp.nextInt();

        System.out.println("Kilonuzu girin:");
        kilo = inp.nextInt();

        double index = (kilo/boy)*boy;

        System.out.println("Vücut kitle indexsiniz:"+index);

    }
}
