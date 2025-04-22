import java.util.Scanner;
public class Odev10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1 = 0,sayi2 = 1,sayi3;
        System.out.print("Fibonacci serisi kaç elemanlı: ");
        int sayi = input.nextInt();

        System.out.print(sayi + " Elemanlı Fibonacci Serisi: " + sayi1 + " " + sayi2 + " ");
        for(int i = 0;i < sayi - 1 ;i++){
            sayi3 = sayi1 + sayi2;
            System.out.print(sayi3 + " ");
            sayi1 = sayi2;
            sayi2 = sayi3;
        }
    }
}
