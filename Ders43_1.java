import java.util.Scanner;
public class Ders43_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,toplam=0,bas=0,deger,kopya;
        System.out.print("sayıyı girin: ");
        sayi = input.nextInt();;
        kopya = sayi;
        while(sayi != 0){
            sayi /= 10;
            bas++;
        }
        sayi = kopya;
       while(sayi != 0){
           deger = sayi % 10;
           toplam += deger;
           sayi /= 10;
       }
       System.out.print("basamak toplamı: "+toplam);
    }
}
