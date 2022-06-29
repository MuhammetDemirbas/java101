import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n1 ,n2,select;

        Scanner inp = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz:");
        n1 = inp.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        n2 = inp.nextInt();
        System.out.println("seçiniz:");
        select = inp.nextInt();

        switch(select){
            case 1:
                System.out.println("toplam:"+(n1+n2));
                break;
            case 2:
                System.out.println("çıkarma:"+(n1-n2));
                break;
            case 3:
                System.out.println("çarpım:"+(n1*n2));
                break;
            case 4:
                if(n2!=0){
                    System.out.println("bölüm:"+(n1/n2));
                }else if(n2==0){
                    System.out.println("bir sayı sıfıra bölünemez.");
                }
                break;
            default:
                System.out.println("Hatalı giriş yaptınz.");



        }

    }
}
