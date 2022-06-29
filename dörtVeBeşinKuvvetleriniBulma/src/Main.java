import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n;
        Scanner inp= new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        n = inp.nextInt();
	for(int i=1; i<=n;i*=4){
        System.out.println(i);
    }
    for(int j=1; j<=n; j*=5){
        System.out.println(j);
    }
    }
}
