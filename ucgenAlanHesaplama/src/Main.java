import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b,c,u,alan ;
        System.out.println("ilk kenar:");
        a = inp.nextInt();
        System.out.println("ikinci kenar:");
        b=inp.nextInt();
        System.out.println("üçüncü kenar:");
        c = inp.nextInt();
        u = (a+b+c)/2;
        alan = (int) Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("üçgenin alanı:"+alan);
    }
}
