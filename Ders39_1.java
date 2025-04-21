import java.util.Scanner;
public class Ders39_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,toplam = 0;
        do{
            System.out.print("sayıyı giriniz: ");
            n = input.nextInt();
            if(n % 4 == 0)
                toplam += n;
        }while(n % 2 == 0);
        System.out.print("toplam: "+toplam);
    }
}
