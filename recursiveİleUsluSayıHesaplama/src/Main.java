import java.util.Scanner;
public class Main {
    static int f(int x,int y){
        int result=1;
        for(int i=1; i<=y;i++){
            result*=x;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x,y;
        System.out.println("Tabandaki sayıyı girin:");
        x= inp.nextInt();
        System.out.println("Üsteki sayiyi giriniz:");
        y= inp.nextInt();
        System.out.println(f(x,y));
    }
}
