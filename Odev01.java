import java.util.Scanner;
public class Odev01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy,kilo;
        System.out.print("boyunuzu metre cinsiinden giriniz: ");
        boy = input.nextDouble();
        System.out.print("kg cinsinden kilonuzu giriniz: ");
        kilo = input.nextDouble();

        double indeks = kilo / ( boy * boy);
        System.out.print("Vücut Kitle İndeksiniz: "+ indeks);

    }
}
