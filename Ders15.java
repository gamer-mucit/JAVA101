import java.util.Scanner;

public class Ders15 {
    public static void main(String[] args) {
       /* int a;
        Scanner y = new Scanner(System.in);
        a = y.nextInt();
        System.out.println(a); */

        Scanner y = new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        int a = y.nextInt();
        //burda veri tipi ne ise next sonuna o gelir
        //örnke olarak veri bir string ifade ise y.nextLine() yazılır
        //double bir ifade ise y.nextDouble yazılır
        System.out.println(a);

    }
}
