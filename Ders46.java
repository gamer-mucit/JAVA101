import java.util.Scanner;
public class Ders46 {
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
                System.out.print("Merhaba Kodluyoruz Bankasına Hoşgeldiniz !!!");
                do {
                    System.out.print("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış");
                    System.out.println("lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();
                    if(select == 1){
                        System.out.print("para miktarı: ");
                        price = input.nextInt();
                        balance += price;
                    }
                    else if(select == 2){
                        System.out.print("Para miktarı");
                        price = input.nextInt();
                        if(price < balance)
                            balance -= price;
                        else
                            System.out.print("Bakiye yetersiz");
                    } else if (select ==3)
                        System.out.print("Bakiyeniz: "+ balance);

                }while(select != 4);
                System.out.print("Tekrar görüşmek üzere");
                break;
            }
            else{
                right--;
                System.out.print("Hatalı kullancı adı veya şifre..Tekrar deneyin");
                if(right == 0)
                    System.out.print("hesabınız bloke olmuştur");
                else
                    System.out.print("kalan deneme hakkınız: " + right);
            }
        }

    }
}
