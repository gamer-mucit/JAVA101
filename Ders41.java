import java.util.Scanner;
public class Ders41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n,total = 1;

        System.out.print("faktörriyel sayısı: ");
        n = input.nextInt();
        for(i = 1; i <= n ;i++){
            total *= i;
        }
        System.out.print(n + ". faktöriyel: "+ total);
    }
}
