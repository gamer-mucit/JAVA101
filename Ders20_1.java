import java.util.Scanner;
public class Ders20_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r,pi = 3.14,aci;
        System.out.print("çemberin çeversini girin: ");
        r = input.nextDouble();
        System.out.print("açı girin: ");
        aci = input.nextDouble();
        double alan = (pi*(r*r)*aci)/360;
        System.out.print("çemberin alanı: "+ alan);

    }
}
