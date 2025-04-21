import java.util.Scanner;
public class Ders38_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, t = 0,toplam = 0;
        System.out.print("kaça kadar toplayalım: ");
        n = input.nextInt();
        for(i =0; i<= n;i++){
            if((i % 3 == 0) && (i%4 == 0)){
                t++;
                toplam += i;
            }
        }
        System.out.print("ortalaması: "+ toplam/t);
    }
}
