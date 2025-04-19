import java.util.Scanner;
public class Ders29_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sicaklik;
        int veri_tarama;
        System.out.print("hava sıcaklığını giriniz: ");
        sicaklik = input.nextDouble();

        veri_tarama = (sicaklik < 5)? 1
                :(sicaklik <= 25)?
                ((sicaklik<=15)? 2:(sicaklik<=10)? 3
                        :((sicaklik<=15) &&(sicaklik<=10)?4:5)):6;

        switch (veri_tarama){
            case 1:
                System.out.print("kayak yapabilirsiniz");
                break;
            case 2:
                System.out.print("sinemaya gidebilirsiniz...");

            case 3:
                System.out.print("piknik yapabilirsiniz");
                break;
            case 4:
                System.out.println("sinemaya gidebilirsiniz...");
                System.out.print("piknik yapabilirsiniz");
            default:
                System.out.print("yüzmeye gidebilirsiniz ...");

        }

    }
}
