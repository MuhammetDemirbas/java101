import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a,b;
        double c ;
        Scanner üçgen = new Scanner(System.in);

        System.out.println("1.kenarı giriniz:");
        a= üçgen.nextInt();
        System.out.println("2.kenarı  giriniz:");
        b= üçgen.nextInt();

        c=Math.sqrt((a*a)+(b*b));

        System.out.println("Hipotenüs:"+c);





    }
}
