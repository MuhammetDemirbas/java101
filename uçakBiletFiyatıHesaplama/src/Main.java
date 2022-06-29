import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int km, yaş;
        int yolculuktipi;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kaç km gideceksiniz:");
        km = inp.nextInt();
        System.out.println("Kaç yasşındasınız:");
        yaş = inp.nextInt();
        System.out.println("Yolculuk tipi:");
        yolculuktipi = inp.nextInt();

        if (yolculuktipi == 1) {
            if (yaş <= 12) {
                System.out.println("üçretiniz:" + (0.10 * km) * 0.50);
            } else if (yaş >= 12 && yaş <= 24) {
                System.out.println("ücretiniz:" + (0.10 * km * 0.10));
            } else if (yaş >= 65) {
                System.out.println("ücretiniz:" + (0.10 * km * 0.30));
            } else {
                System.out.println("ücretiniz:" + (0.10 * km));
            }
        } else if (yolculuktipi == 2) {
            if (yaş <= 12) {
                System.out.println("üçretiniz:" + (0.10 * km) * 0.50 * 0.20);
            } else if (yaş >= 12 && yaş <= 24) {
                System.out.println("ücretiniz:" + (0.10 * km * 0.10 * 0.20));
            } else if (yaş >= 65) {
                System.out.println("ücretiniz:" + (0.10 * km * 0.30 * 0.20));

            } else {
                System.out.println("ücretiniz" + (0.10 * km * 0.20));


            }

        }
    }
}
