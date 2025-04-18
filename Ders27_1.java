import java.util.Scanner;
public class Ders27_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName,password,secim;

        System.out.print("kullanıcı adı giriniz: ");
        userName = input.nextLine();

        if(userName.equals("patika")){
            System.out.print("şifrenizi giriniz: ");
            password = input.nextLine();
            if(password.equals("java123")){
                System.out.print("sisteme giriş yapılıyor...");
            }
            else{
                System.out.println("şifreniz yanlış :( ");
                System.out.print("şifrenizi tekrar oluşturmak ister misiniz?[y/n]: ");
                secim = input.nextLine();
                if(secim.equals("y") || secim.equals("Y")){
                    System.out.print("yeni şifre giriniz: ");
                    password = input.nextLine();
                    if(!password.equals("java123")){
                        System.out.print("şifre oluşturuldu ***");
                    }
                    else
                        System.out.print("yeni şifreniz bir önceki şifre ile aynı olamaz");
                }
                else
                    System.out.print("yeni şifre oluşturulmadı ...");
            }
        }
        else
            System.out.print("kullanıcı adı hatalı...");

    }
}
