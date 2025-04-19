import java.util.Scanner;
public class Ders29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double heat;
        System.out.print("hava sıcaklığını giriniz: ");
        heat = input.nextDouble();
        if(heat<5){
            System.out.print("kayak yapabilirsiniz...");
            }
        else if(heat <=25 ){
            if (heat<=15){
                System.out.print("sinemaya gidebilirsiniz...");
                }
            if(heat >= 10){
                System.out.print("pikniğe gidebilirsiniz...");
                }
            }
        else {
            System.out.print("tüzmeye gidebilirsiniz...");
        }
    }
}/*Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/
