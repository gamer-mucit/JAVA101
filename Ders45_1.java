import java.util.Scanner;
public class Ders45_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("basamak sayısını giriniz: ");
        int n = input.nextInt();
        int h = n-1;
        for(int i =1;i <= n; i++){
            for(int k =1;k <= (n-i) ;k++){
                System.out.print(" ");
            }

            for(int j = 1; j <= (2*i) - 1 ;j++) {
                System.out.print("*");
            }
            System.out.println();

        }for (int i = n-1 ; i >= 1; i--) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
