import java.util.Scanner;
public class Odev08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bas;
        System.out.print("basamak sayısını giriniz: ");
        bas = input.nextInt();

        for(int i = bas; i > 0;i--){
            for(int k = 0;k < i; k++)
                System.out.print("*");
            System.out.println();
        }

    }
}
