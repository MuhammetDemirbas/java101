import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
	    int a,b,c;
        System.out.println("1.sayıyı girin:");
        a=inp.nextInt();
        System.out.println("2.sayıyı girin:");
        b=inp.nextInt();
        System.out.println("3.Sayıyı girin:");
        c= inp.nextInt();

        if((a<b)&&(a<c)){
            if(b<c){
                System.out.println("a<b<c");
            }else{
                System.out.println("a<c<b");
            }
        }else if((b<a)&&(b<c)){
            if(a<c){
                System.out.println("b<a<c");
            }else{
                System.out.println("b<c<a");
            }
        }else if((c<a)&&(c<b)){
            if(a<b){
                System.out.println("c<a<b");
            }else{
                System.out.println("c<b<a");
            }
        }

    }
}
