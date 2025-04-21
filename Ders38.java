import java.util.Scanner;
public class Ders38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k,i;
        System.out.print("sayı giriniz: ");
        k = input.nextInt();
        for(i = 0;i <= k; i++){
            if(i % 2 ==0){
                System.out.println(i);
            }
        }
    }
}
