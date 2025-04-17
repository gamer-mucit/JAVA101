import java.util.Scanner;
public class Ders19_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km,km_fiyati;
        System.out.print("gidilen yolun km cinsinde yazınız: ");
        km = input.nextDouble();
        km_fiyati = 10 + (km * 2.2);
        if(km_fiyati <0){
            System.out.println("lütfen geçerli bir sayı girin...");
        }
        else if(km_fiyati < 20){
            System.out.print("taksiye ödenecek tutar: 20 TL");
        }
        else{
            System.out.print("taksiye ödenecek tutar: "+ km_fiyati);
        }

    }
}
