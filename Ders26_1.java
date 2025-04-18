import java.util.Scanner;
public class Ders26_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1,sayi2,secim,sonuc;

        System.out.print("birinci sayıyı girin: ");
        sayi1 = input.nextInt();
        System.out.print("ikinci sayıyı girin: ");
        sayi2 =input.nextInt();
        System.out.println("1-toplama\n2-çıkarma\n3-bölme\n4-çarpma");
        System.out.print("seçim sayısını giriniz: ");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                sonuc = sayi1 + sayi2;
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                break;
            case 3:
                if (sayi2 != 0)
                    sonuc = sayi1 / sayi2;
                else {
                    sonuc =0;
                    System.out.println("bir sıfıra bölünmez...");
                }
                break;
            case 4:
                sonuc = sayi1 * sayi2;
                break;
            default:
                System.out.print("Geçerli  bir işlem sayısı girin");
                sonuc = 0;
        }
        System.out.print("işleminizin sonucu: " + sonuc);
    }
}
