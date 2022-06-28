import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int mat,fizik,turkce,tarih,muzik;
        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz:");
        mat = inp.nextInt();

        System.out.println("fizik notunuzu giriniz:");
        fizik = inp.nextInt();

        System.out.println("Turkce notunuzu giriniz:");
        turkce = inp.nextInt();

        System.out.println("tarih notunuzu giriniz:");
        tarih= inp.nextInt();

        System.out.println("muzik notunuzu giriniz:");
        muzik= inp.nextInt();

        int toplam = mat+fizik+turkce+tarih+muzik;
        double sonuc = toplam/6.0;

        System.out.println("ortalamanız:" + sonuc);


        boolean kosul1 = sonuc >=60;
        boolean kosul2 = sonuc < 60 ;

        boolean result = !(kosul1&&kosul2) ;
        String str = result ? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(str);









    }
}
