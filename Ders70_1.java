import java.util.Arrays;
import java.util.Scanner;

public class Ders70_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int n;
        System.out.print("Bir sayı giriniz : ");
        n = input.nextInt();

        System.out.println("Dizi : " + Arrays.toString(list));
        Arrays.sort(list);

        int i = Arrays.binarySearch(list, n);

        if (i < 0) {
            i = -(i + 1);
        }

        System.out.println("Girilen Sayı : " + n);


        if (i > 0) {
            System.out.println("Girilen sayıdan küçük en yakın sayı : " + list[i - 1]);
        } else {
            System.out.println("Girilen sayıdan küçük en yakın sayı yok.");
        }


        if (i < list.length - 1) {
            System.out.println("Girilen sayıdan büyük en yakın sayı : " + list[i + 1]);
        } else {
            System.out.println("Girilen sayıdan büyük en yakın sayı yok.");
        }
    }
}
