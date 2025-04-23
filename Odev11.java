import java.util.Scanner;
public class Odev11 {
    static int usAlma(int a,int b){
        if(b == 0)
            return 1;
        return usAlma(a,b-1) * a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Taban değeri giriniz : ");
        a = input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        b = input.nextInt();
        int result = usAlma(a,b);
        System.out.print("Sonuç : " + result);

    }
}
