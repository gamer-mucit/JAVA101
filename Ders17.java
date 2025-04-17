import java.util.Scanner;
public class Ders17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fiyat;

        System.out.print("tutarı giriniz: ");
        fiyat = input.nextInt();
        System.out.println("KDV'siz Fiyat: "+ fiyat);

        if(fiyat < 0){
            System.out.print("lütfen tutarı tekrar girin...");
        }
        else if(fiyat <=1000){
            double KDV_fiyati;
            KDV_fiyati = fiyat * 0.18;
            double toplam = fiyat + KDV_fiyati;
            System.out.println("KDV'li Fiyat: "+ toplam);
            System.out.print("KDV tutarı "+KDV_fiyati);
        }
        else{
            double KDV_fiyati;
            KDV_fiyati = fiyat * 0.08;
            double toplam = fiyat + KDV_fiyati;
            System.out.println("KDV'li Fiyat: "+ toplam);
            System.out.print("KDV tutarı "+KDV_fiyati);
        }
    }
}
