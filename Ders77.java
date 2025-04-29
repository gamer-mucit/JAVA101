import java.util.Scanner;
public class Ders77 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y;
        System.out.println("İstediğiniz mayın tarlası kaçlık olsun : ");
        System.out.print("satır : ");
        x = input.nextInt();
        System.out.print("sütun : ");
        y = input.nextInt();

        if(!((x > 0)  && (y > 0))){
            System.out.print("Lütfen geçerli sayı giriniz");
        }
        else {
            MayinTarlasi tarla = new MayinTarlasi();
            tarla.MayinTablo(x,y);
            tarla.run();
        }

        input.close();
    }
}
