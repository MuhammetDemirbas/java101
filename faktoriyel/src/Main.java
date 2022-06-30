import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int x ,y;
        int total1 =1,total2=1,total3=1;
        Scanner inp = new Scanner(System.in);

        System.out.println("ilk sayıyı belirleyin:");
        x = inp.nextInt();

        System.out.println("ikinci sayıyı girin:");
        y = inp.nextInt();

        for (int i=1; i<=x; i++){
            total1 = total1*i;


        }
        

        for (int k=1; k<=y;k++){
            total2=total2*k;

        }


        for (int j=1; j<=(x-y);j++){
            total3 =total3*j;
        }


        int kombinasyon = total1/(total2 *total3);

        System.out.println("Sonuç:"+kombinasyon);

    }
}
