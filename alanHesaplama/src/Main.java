import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int r,q;
        double pi=3.14;

        Scanner inp = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını girin:");
        r = inp.nextInt();
        System.out.println("Dairenin açısını girin:");
        q = inp.nextInt();

        double alan = (pi *(r*r)*q)/360;

        System.out.println("Üçgenin alanı:"+ alan);


    }
}
