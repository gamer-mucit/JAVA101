import java.util.Scanner;
public class Ders26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1,sayi2,secim;

        System.out.print("birinci sayıyı giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        sayi2 = input.nextInt();
        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.print("seçiminizi yapınız: ");
        secim =input.nextInt();

        if(secim == 1)
            System.out.print("toplama: "+(sayi1 + sayi2));
        else if(secim == 2)
            System.out.print("çıkarma: "+(sayi1 - sayi2));
        else if(secim == 3)
            System.out.print("çarpma: "+(sayi1 * sayi2));
        else if(secim == 4)
            if(sayi2 != 0)
                System.out.print("bölme: "+(sayi1 / sayi2));
            else
                System.out.print("bir sayı 0'a bölünmez");
        else
            System.out.print("geçerli seçim yapınız...");

    }
}
