import java.util.Scanner;
public class Ders40 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        n = input.nextInt();
        for (int i =1 ;i <= n; i*=2){
            System.out.println(i);
        }
    }
}
