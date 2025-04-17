import java.util.Scanner;
public class Ders16 {
    public static void main(String[] args){
        int mat,fiz,turk,muz,tar,kim;
        Scanner input = new Scanner(System.in);
        System.out.print("matematik notunu giriniz: ");
        mat = input.nextInt();
        System.out.print("türkçe notunu giriniz: ");
        turk = input.nextInt();
        System.out.print("tarih notunu giriniz: ");
        tar = input.nextInt();
        System.out.print("kimya notunu giriniz: ");
        kim = input.nextInt();
        System.out.print("müzik notunu giriniz: ");
        muz = input.nextInt();
        System.out.print("fizik notunu giriniz: ");
        fiz = input.nextInt();

        int sonuc = (mat + turk + muz + tar + kim + fiz);
        float ort = sonuc /6f;
        System.out.println("genel ort: "+ ort);

        if (ort <= 0){
            System.out.println("sistem hatası");
        }
        else if (ort <= 60) {
            System.out.print("kaldı");
        }
        else {
            System.out.print("geçti");
        }

    }
}