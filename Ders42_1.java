import java.util.Scanner;
public class Ders42_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,x,i,u = 1;
        System.out.print("üssü alınnacak sayı giriniz: ");
        n = input.nextInt();
        System.out.print("üs olucak sayı girin: ");
        x = input.nextInt();

        for (i = 0; i < x; i++) {
            u *= n;
        }
        
        System.out.print("cevap: "+ u);
    }
}
