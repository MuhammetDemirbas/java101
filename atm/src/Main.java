import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String userName,passWord;

        Scanner inp =new Scanner(System.in);

        int right =3;
        int balance = 1500;
        int select;

        while(right>0){
            System.out.println("Kullanıcı adınızı giriniz:");
            userName=inp.nextLine();
            System.out.println("Şifrenizi giriniz:");
            passWord=inp.nextLine();

            if(userName.equals("patika")&&passWord.equals("dev123")){
                System.out.println("Merhaba.Kodluyoruz bankasına hoşgeldiniz.");

                do{
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçin:");
                    System.out.println("1-para yatırma\n"+
                            "2- Para çekme\n"+
                            "3-Bakiye sorgulama\n"+
                            "4-Çıkış yapma");
                    select = inp.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("para miktarı:");
                            int price = inp.nextInt();
                            balance+=price;
                        case 2:
                            System.out.println("para miktarı:");
                            int draw = inp.nextInt();
                            balance-=draw;
                        case 3:
                            System.out.println("Bakiyeniz:"+balance);

                    }
                }while (select!=4);


                break;
            }else{
                --right;
                System.out.println("Hatalı kullanıcı adı veya şifre.Tekrar deneyiniz.");
                if(right==0){
                    System.out.println("Hesabınız bloke olmuştur.Lütfen banka ile iletişime geçin:");
                }else{
                    System.out.println("Kalan hakkınız:" + right);
                }

            }
        }

    }
}
