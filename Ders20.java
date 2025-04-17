import java.util.Scanner;
public class Ders20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double pi =3.14;
        System.out.print("çevrenin yarı çap uzunluğunu giriniz: ");
        r = input.nextInt();
        double cevre = (2 * r * pi);
        double alan = ( r * r * pi);
        System.out.println("çemberin çeversi: "+ cevre);
        System.out.println("çemberin alanı: "+ alan);

    }
}
