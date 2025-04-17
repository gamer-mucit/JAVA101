import java.util.Scanner;
public class Ders19 {
    public static void main(String[] args) {
        int km;
        double perKM = 2.20,total,StartPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafe KM cinsinden giriniz: ");
        km = input.nextInt();
        total = (km * perKM);
        total += StartPrice;

        total = (total <20 )? 20 : total;
        System.out.print("Ödenecek tutar: "+total);
    }
}
