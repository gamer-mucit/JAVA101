import java.util.Scanner;
import java.util.Arrays;

public class Odev16 {
    public static void main(String[] args) {
        System.out.print("Kaç adet sayı girişi olucak : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] dizi = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayı : ");
            dizi[i] = input.nextInt();
        }
        Arrays.sort(dizi);

        int i = 0;
        while (i < n) {
            int sayi = dizi[i];
            int sayac = 0;

            while(i < n && sayi == dizi[i]) {
                sayac++;
                i++;
            }
            System.out.println(sayi + " sayısı " + sayac + " kere tekrar edildi");
        }
    }
}
