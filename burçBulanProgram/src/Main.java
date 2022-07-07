import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int month,day;

        System.out.println("Hangi ayda doğdunuz:");
        month= inp.nextInt();

        System.out.println("Hangi günde doğdunuz;");
        day= inp.nextInt();

       if ((day>=21&&day<=30&&month==3)||(day<=20&&month==4)){
           System.out.println("Koç burcu");
       }else if((day>=21&&day<=30&&month==4)||(day<=21&&month==5)){
           System.out.println("Boğa burcu");
       }else if((day>=22&&day<=30&&month==5)||(day<=22&&month==6)){
           System.out.println("İkizler Burcu");
       }else if((day>=23&&day<=30&&month==6)||(day<=22&&month==7)){
           System.out.println("Aslan Burcu");
       }else if((day>=23&&day<=30&&month==7)||(day<=22&&month==8)){
           System.out.println("Aslan burcu");
       }else if((day>=23&&day<=30&&month ==8)||(day<=22&&month==9)){
           System.out.println("Başak Burcu");
       }else if((day>=23&&day<=30&&month==9)||(day<=22&&month==10)){
           System.out.println("Terazi Burcu");
       }else if ((day>=23&&day<=30&& month==10)||(day<=21&&month==11)){
           System.out.println("Akrep Burcu");
       }else if ((day>=22&&day<=30&&month==11)||(day<=21&&month==12)){
           System.out.println("Yay Burcu");
       }else if ((day>=22&&day<=30&&month==12)||(day<=21&&month==1)){
           System.out.println("Oğlak Burcu");
       }else if ((day>=22&&day<=30&&month==1)||(day<=19&&month==2)){
           System.out.println("Kova Burcu");
       }else if ((day>=20&&day<=28&&month==2)||(day<=20 &&month==3)){
           System.out.println("Balık Burcu");
       }else{
           System.out.println("Hatalı sayı girdiniz. Tekrar deneyiniz.");
       }



    }
}
