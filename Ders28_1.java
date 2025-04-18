import java.util.Scanner;
public class Ders28_1 {
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

       if(!((mat < 0) || (mat > 100) || (turk < 0) || (turk > 100) || (kimya < 0) || (kimya > 100) || (muzik < 0) || (muzik > 100) || (fizik < 0) || (fizik > 100))){
           double ort = (mat + turk +fizik+kimya+muzik) / 5.0;
           String sonuc = (ort>55)? "geçti" : "kaldı";

           System.out.println("derslerin ortalaması: "+ ort);
           System.out.print("sınıf geçme durumu: "+ sonuc);
        }
       else
           System.out.print("litfen girinlen sayıları 0 ile 100 arasında girin");

    }
}
