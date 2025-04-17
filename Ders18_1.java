import java.util.Scanner;
public class Ders18_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c,a,b;

        System.out.print("kısa kenar uzunluğunu girin: ");
        a = input.nextDouble();
        System.out.print("uzun kenar uzunluğunu girin: ");
        b = input.nextDouble();
        System.out.print("Hipotenüs kenarının uzunluğunu girin: ");
        c = input.nextDouble();
        double u = (a+b+c) / 2;
        double Alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("üçgenin alanı: "+ Alan);
    }
}