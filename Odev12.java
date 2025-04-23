import java.util.Scanner;
public class Odev12 {
    static int asal(int a,int b){
       if(b != a){
        if(a % b == 0)
            return 0;
        else
            return 1;
       }
        return asal(a,b+1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int a = input.nextInt();
        int result = asal(a,2);

        if(result == 1)
            System.out.print(a + " sayısı ASALDIR !");
        else
            System.out.print(a + " sayısı ASAL değildir");
    }
}
