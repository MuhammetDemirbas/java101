import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a=0,x;
        int[] list = {15,12,788,1,a,-1,-778,2,0};

        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        x = inp.nextInt();
        a+=x;

        for ( int i=0; i< list.length;i++){
            if(a<list[i]){
                System.out.println("Girilen  sayıdan en küçük sayı:"+ list[i-1]);
                System.out.println("Girilen sayıdan büyük en yakın sayı:"+list[i]);
                break;
            }
            }
        }
    }

