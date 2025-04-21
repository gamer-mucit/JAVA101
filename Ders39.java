import java.util.Scanner;
public class Ders39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,total = 0;

        do{
            System.out.print("sayı giriniz: ");
            n = scan.nextInt();
            if( n%2 == 1)
                total += n;
        }while(n > 0);

        System.out.print("toplam: "+ total);
    }
}