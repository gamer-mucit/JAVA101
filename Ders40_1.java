import java.util.Scanner;
public class Ders40_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n;
        System.out.print("sayıyı giriniz: ");
        n = input.nextInt();
        for(i = 1; i <= n; i *= 4)
            System.out.println("4'ün katları: "+ i);
        for(i = 1; i <= n; i *= 5)
            System.out.println("5'in katları: "+ i);

    }
}
