import java.util.Scanner;
public class Main {
    static void plus(){
        Scanner scan =new Scanner(System.in);
        int number , result =0, i=1;
        while(true){
            System.out.println(i++ +".sayı:");
            number = scan .nextInt();

            if(number ==0){
                break;
            }
            result+=number;
        }
        System.out.println("Sonuç:"+ result);
    }

    static void minus(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç adet gireceksiniz:");
        int counter= scan .nextInt();
        int number ,result =0;

        for ( int i= 1; i<= counter ;i++){
            System.out.println(i +".sayı:");
            number = scan .nextInt();

            if(i==1){
                result+=number;
                continue;
            }
            result-=number;
        }
        System.out.println("Sonuç:"+result);
    }

    static void times(){
        Scanner scan =new Scanner(System.in);
        int number, result =1, i=1;

        while (true) {
            System.out.println(i++ +".sayı:");
            number = scan.nextInt();
            if(number==1)
                break;

            if(number ==0){
                result =0;
                break;
            }
            result*=number;

        }
        System.out.println("Sonuç:"+result);
    }

    static void divided(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz:");
        int counter =scan.nextInt();
        double number, result =0.0;

        for (int i=1; i<= counter ; i++){
            System.out.println(i+".sayı:");
            number = scan.nextDouble();
            if(i !=1 && number ==0){
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if(i==1){
                result= number;
                continue;
            }
            result /=number;
        }
        System.out.println("Sonuç:"+result);
    }

    static void power(){

        Scanner scan = new Scanner( System.in);
        System.out.println("Taban değerini giriniz:");
        int base = scan .nextInt();
        System.out.println("Üs değerini giriniz:");
        int exp = scan.nextInt();
        int result =1;

        for (int i= 1; i<=exp;i++){
            result*=base;
        }
        System.out.println("Sonuç:"+result);
    }

    static void factorial(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int n = scan.nextInt();
        int result=1;

        for(int i= 1; i<=n; i++){
            result *=i;
        }
        System.out.println("Sonuç:"+result);
    }

    static void mod(){
        Scanner scan = new Scanner(System.in);
        System.out.println("ilk sayıyı girin :");
        int x = scan.nextInt();
        System.out.println("ikinci sayıyı girin:");
        int y = scan .nextInt();

        double result = x%y;

        System.out.println("Sonuç"+result);
    }
    static void dikdortgen(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hangi işlemi yapıcaksınız:");
        int c = scan.nextInt();
        System.out.println("ilk sayıyı girin:");
        int a= scan.nextInt();
        System.out.println("ikinci kenarı girin:");
        int b = scan.nextInt();

        if ( c ==1){
            int cevre = 2*(a+b);
            System.out.println("cevre:"+cevre);
        }else{
            int alan = (a*b);
            System.out.println("alan :"+alan);
        }



    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Toplama işlemi\n"
                +"2-Çıkarma İşlemi\n"
                + "3-Çarpma İşlemi\n"
                +"4-Bölme İşlemi\n"
                +"5-Üslü Sayı Hesaplama\n"
                +"6-Faktoriyel Hesaplama\n"
                +"7-Mod Alma"
                +"8-Dikdörtgen alan ve Çevresi"
                +"0-Çıkış Yap";

        do{
            System.out.println(menu);
            System.out.println("Lütfen bir işlem seçin:");
            select = scan.nextInt();
            switch(select){
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3 :
                    times();
                    break;

                case 4:
                    divided();
                    break;
                case 5 :
                    power();
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    dikdortgen();
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz,tekrar deneyiniz.");
            }
        }while(select!=0);
    }
}
