import java.util.Scanner;
public class Odev03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yas,secim,gidiş;
        double mesafe,fiyat;
        System.out.print("yolculuk yapacak kişinin yaşı: ");
        yas = input.nextInt();
        System.out.print("mesafe kaç km: ");
        mesafe =input.nextDouble();
        System.out.print("\nGİDİŞ TERCİHİNİZİ GİRİN\n1-Tek yön\n2-Çift yön: ");
        secim = input.nextInt();

        if(yas < 0 || mesafe < 0)
            System.out.print("Hatalı Veri Girdiniz !");

        fiyat = mesafe * 0.10;

        if(secim == 1)
            fiyat *= 1;
        else
            fiyat *= 1.6;

        if(yas < 12){
            fiyat *= 0.5;
        }
        else if(yas > 12 && yas < 24){
            fiyat *= 0.9;
        }
        else if(yas < 65){
            fiyat *=0.3;
        }
        System.out.print("verilen yolcu bilgileri:\nYas: "+ yas +" ** mesafe: "+ mesafe +" ** gidiş no: "+ secim+"\nÜCRET: "+fiyat);




    }
}
