import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik;

        System.out.println("Mat notunu giriniz:");
        mat=inp.nextInt();

        System.out.println("Fizik notunu girin:");
        fizik=inp.nextInt();

        System.out.println("Turkce notunuzu girin.");
        turkce =inp.nextInt();

        System.out.println("kimya notunu girin:");
        kimya=inp.nextInt();

        System.out.println("muziknotunu girin:");
        muzik=inp.nextInt();
       if(mat<=100&&mat>=0&&fizik<=100&&fizik>=0&&turkce>=0&&turkce<=100&&kimya>=0&&kimya<=100&&muzik>=0&&muzik<=100){
           double average = (muzik+mat+kimya+fizik+turkce)/5;
           if(average>=55){
               System.out.println("Tebrikler geçtiniz.");
           }else{
               System.out.println("Kaldınız.Seneye görüşmek üzere.");
           }
           System.out.println("Ortalamnız:"+average);

       }

    }
}
