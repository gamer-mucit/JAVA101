import java.util.Scanner;
public class Odev07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,toplam = 0;

        System.out.print("bir sayı giriniz: ");
        sayi = input.nextInt();

        for(int i = 1; i < sayi ; i++ ){
            if(sayi % i == 0){
                toplam += i;
            }
        }
        if(toplam == sayi)
            System.out.print(sayi + " Mükemmel sayıdır");
        else
            System.out.print(sayi + " Mükemmel sayı değildir");

    }
}
