import java.util.Scanner;
public class Ders34 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int pass;
        boolean askPass = false;
        do {
            System.out.print("şifre giriniz: ");
            pass = input.nextInt();
            if(pass ==123){
                System.out.println("şifre doğru");
                askPass = true;
            }
            else {
                System.out.println("şifre yanlış ");
            }
        }while(!askPass);
    }
}
