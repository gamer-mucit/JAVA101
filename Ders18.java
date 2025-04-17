import java.util.Scanner;
public class Ders18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kisakenar,uzunkenar;
        double karsikenar;

        System.out.print("kısa kenarı girin: ");
        kisakenar = input.nextInt();
        System.out.print("uzun kenarı girin: ");
        uzunkenar = input.nextInt();

        karsikenar= Math.sqrt((kisakenar*kisakenar)+(uzunkenar*uzunkenar));
        // bir sayının kare kökünü almak inin Math kütüphaneden sqrt çalıştırılır.
        System.out.print("karşı kenar uzunluğu: "+ karsikenar);
    }
}
