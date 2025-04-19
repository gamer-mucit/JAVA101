import java.util.Scanner;
public class Ders30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("a sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("b sayıyı giriniz: ");
        b = input.nextInt();
        System.out.print("c sayıyı giriniz: ");
        c = input.nextInt();

        if((a>b) && (a>c)){
            if(b>c)
                System.out.print("a > b > c");
            else
                System.out.print("a > c > b");
        }
        else if((b>a) && (b>c)){
            if(a>c)
                System.out.print("b > a > c");
            else
                System.out.print("b > c > a");
        }else{
            if(b>a)
                System.out.print("c > b > a");
            else
                System.out.print("c > a > b");
        }
    }
}
