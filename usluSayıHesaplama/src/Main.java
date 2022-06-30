import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int x,y,total=1;

        Scanner inp = new Scanner(System.in);

        System.out.println("1.sayıyı girin:");
        x = inp.nextInt();

        System.out.println("2.sayıyı girin:");
        y = inp.nextInt();

        for (int i=1; i<=y; i++){
            total*=x;
        }

        System.out.println("Result :"+total);

    }
}
