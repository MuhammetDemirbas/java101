import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String passWord,userName,b,newPassWord;
        System.out.println("Kullanıcı adınızı girin:");
        userName=inp.nextLine();
        System.out.println("Şifrenizi girin:");
        passWord = inp.nextLine();
        if(userName.equals("patika")&&passWord.equals("java123")){
            System.out.println("Giriş yaptınız");
        }else {
            System.out.println("Kullanıcı adı veya şifre yanlış");
            System.out.println("Şifrenizi değiştirmek istermisiniz:");
            b = inp.next();
            if (b.equals("evet"))
            {
                System.out.println("Yeni şifrenizi giriniz:");
                newPassWord= inp.next();
                System.out.println("Şifreniz değiştirldi.");
                if (newPassWord.equals("patika123"))
                {
                    System.out.println("Yeni şifreniz eskisiyle aynı olamaz.");
                }
            }else if(b.equals("hayır")){
                System.out.println("Şifreniz değiştirilemedi.");
            }
        }

    }
}
