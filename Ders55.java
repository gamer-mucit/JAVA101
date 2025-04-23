import java.util.Scanner;
public class Ders55 {
    static int sum(int a,int b){
        int result = a + b;
        System.out.println("Toplam: " + result);
        return result;
    }

    static int minus(int a,int b){
        int result = a-b;
        System.out.println("Çıkarma: " + result);
        return result;
    }

    static int times(int a,int b){
        int result = a * b;
        System.out.println("Çarpma: " + result);
        return result;
    }

    static double divided(int a,int b){
        if(b == 0){
            System.out.println("ikinci sayı 0'dan farklı olmalıdır");
        }
        double result = a/b;
        System.out.println("Bölüm: "+ result);
        return result;
    }

    static int power(int a,int b){
        int result = 1;
        for(int i = 0;i < b;i++)
            result *= a;
        System.out.println("üs alma: " + result);
        return result;
    }

    static int mod(int a,int b){
        int result = (a % b);
        System.out.println("modu: " + result);
        return result;
    }
    static int alanHesaplama(int a,int b){
        System.out.println("Dikdötgen çevresi: "+ (a+b)*2);
        System.out.println("alan: "+ a*b);
        return a*b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        while(true){
            System.out.println(menu);
            System.out.print("İşlmeinizi Seçiniz: ");
            select = input.nextInt();

            if(select == 0)
                break;

            System.out.print("ilk sayı: ");
            int a = input.nextInt();
            System.out.print("ikinci sayı: ");
            int b = input.nextInt();

            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    alanHesaplama(a,b);
                    break;
                default:
                    System.out.println("hatalı tuşlama...");
            }

        }
        System.out.print("Güle Güle");
    }
}
