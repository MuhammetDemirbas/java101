import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       double tutar,kdv1=0.18,kdv2=0.08;
       Scanner input = new Scanner(System.in);
       System.out.println("Ücret Tutarını Giriniz:");
       tutar = input.nextDouble();
       double kdvOranı = (tutar<=1000)?kdv1:kdv2;
       double kdvsi= tutar*kdv1;
       double kdvliTutar = tutar+kdvsi;
       System.out.println(kdvliTutar);
    }
}
