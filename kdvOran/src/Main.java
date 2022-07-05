import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x;
        double select,result;
        System.out.println("Ürün Fiyatı:");
        x = inp.nextInt();
        if(0<=x&&x<=1000){
            select = x*0.18;
            System.out.println("ürününüzün kdvsi:"+select);
        }else if (x>=1000){
            result= (x*0.08);
            System.out.println("ürününüzün Kdvsi"+result);
        }else{
            System.out.println("Yanlış bilgi!");
        }
    }
}
