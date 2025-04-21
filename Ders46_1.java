import java.util.Scanner;
public class Ders46_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName,password;
        int right = 3,select,balance = 1500,price;
        while(right > 0){
            System.out.print("kullanıcı adı: ");
            userName = input.nextLine();
            System.out.print("kullancı şifre: ");
            password = input.nextLine();

            if(userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba Kodluyoruz Bankasına Hoşgeldiniz !!!");
                do {
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış");
                    System.out.print("lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("para miktarı: ");
                            price = input.nextInt();
                            System.out.println();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı: ");
                            price = input.nextInt();
                            System.out.println();
                            if (price < balance)
                                balance -= price;
                            else
                                System.out.println("Bakiye yetersiz\n");
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: "+ balance);
                            System.out.println();
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Lütfen geçerli bir sayı giriniz !!!");
                            System.out.println();
                    }
                }while(select != 4);
                System.out.print("Tekrar görüşmek üzere");
                break;
            }
            else{
                right--;
                System.out.println("Hatalı kullancı adı veya şifre ..: Tekrar deneyin");
                if(right == 0)
                    System.out.println("hesabınız bloke olmuştur");
                else
                    System.out.println("kalan deneme hakkınız: " + right);
            }
        }

    }
}
