import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int heat;
        System.out.println("Hava sıcaklığı:");
        heat = inp.nextInt();
        if(heat<5){
            System.out.println("Kayak yapmalısınız.");
        }else if(heat<=15&&heat>=5){
            System.out.println("Sinemaya gidebilirsiniz.");
        }else if(heat<=25&&heat>15){
            System.out.println("Pikniğe gitmelisiniz.");
        }else if(heat>25){
            System.out.println("Yüzmeye gitmelisiniz.");
        }else{
            System.out.println("yanlış sayı1");
        }
    }
}
