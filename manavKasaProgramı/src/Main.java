import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double armut , elma,domates,muz,patlıcan,result;
        System.out.println("Armut kaç kilo:");
        armut = inp.nextDouble();
        System.out.println("Elma kaç kilo:");
        elma = inp.nextDouble();
        System.out.println("Domates kaç kilo:");
        domates = inp.nextDouble();
        System.out.println("Muz kaç kilo:");
        muz = inp.nextDouble();
        System.out.println("Patlıcan kaç kilo:");
        patlıcan= inp.nextDouble();
        result=(2.14*armut)+(3.67*elma)+(1.11*domates)+(0.95*muz)+(5.00*patlıcan);
        System.out.println("Ödemeniz gereken tutar:"+ result);
    }
}
