import java.util.Scanner;
public class Ders44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n sayısını giriniz");
        int n = input.nextInt();
        double result = 0;
        for(int i = 0; i < n;i++){
            result += (1.0/i);
        }
        System.out.print(result);
    }
}
