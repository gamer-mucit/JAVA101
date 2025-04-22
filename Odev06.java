import  java.util.Scanner;
public class Odev06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,sayi,enb = -100000,enk = 1000000,i = 1;
        System.out.print("kaç sayı giriceksiniz: ");
        n  = input.nextInt();
        while(i != n+1 ){
            System.out.print(i + ".sayıyı giriniz: ");
            sayi= input.nextInt();

            if(sayi > enb)
                enb = sayi;

            else if(sayi < enk)
                enk = sayi;
            i++;
        }
        System.out.println("En büyük sayı: " + enb);
        System.out.println("En küçük sayı: " + enk);
    }
}
