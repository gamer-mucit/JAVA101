import java.util.Scanner;
public class Ders28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,kimya,turk,muzik,fizik;

        System.out.print("matematik notunu giriniz: ");
        mat = input.nextInt();
        System.out.print("türkçe notunu giriniz: ");
        turk = input.nextInt();
        System.out.print("kimya ders notunu giriniz: ");
        kimya = input.nextInt();
        System.out.print("fizik ders notunu giriniz: ");
        fizik = input.nextInt();
        System.out.print("müzik notunu giriniz");
        muzik = input.nextInt();
        double avarage =(mat + turk +fizik+kimya+muzik) / 5.0;
        if(avarage <= 55)
            System.out.println("sınıfta kaldını seneye tekrar görüşmek üzere ..");
        else
            System.out.println("tebrikler snıfı geçtiniz***");

        System.out.print("ortalamanız: "+avarage);
    }
}
