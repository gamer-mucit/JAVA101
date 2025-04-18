import java.util.Scanner;
public class Ders27 {
    public static void main(String[] args) {
        String userName,password;
        Scanner input = new  Scanner(System.in);

        System.out.println("kullanıcı adını giriniz: ");
        userName = input.nextLine();
        System.out.print("şiifrenizi giriniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123"))
            System.out.print("giriş yapılıyor...");
        else
            System.out.print("Maalefes şifre veya kullanıcı adı yanlış ???");
    }
}
