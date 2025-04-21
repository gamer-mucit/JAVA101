import java.util.Scanner;
public class Ders42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,k,total = 1,i = 1;
        System.out.print("üssü alınacak sayı: ");
        n = input.nextInt();
        System.out.print("üs olan sayı: ");
        k = input.nextInt();

        while(i <= k){
            total *= n;
            i++;
        }
        System.out.print("cevap: "+ total);
    }
}
