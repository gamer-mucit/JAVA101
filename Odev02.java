import java.util.Scanner;
public class Odev02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double elma = 3.67 ,armut = 2.14 ,domates =1.11 ,muz = 0.95 ,patlican = 5.00,tutar;
        double kg;
        System.out.print("armut kaç kilo ? :");
        kg = input.nextDouble();
        armut *= kg;
        System.out.print("elma kaç kilo ? :");
        kg = input.nextDouble();
        elma *= kg;
        System.out.print("domates kaç kilo ? :");
        kg = input.nextDouble();
        domates *= kg;
        System.out.print("muz kaç kilo ? :");
        kg = input.nextDouble();
        muz *= kg;
        System.out.print("patlıcan kaç kilo ? :");
        kg = input.nextDouble();
        patlican *= kg;

        tutar = (armut+elma+muz+patlican+domates);
        System.out.print("toplam tutar: "+tutar);
    }
}
