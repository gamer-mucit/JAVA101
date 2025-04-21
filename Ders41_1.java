import java.util.Scanner;
public class Ders41_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n,r,sonuc = 1, newN = 1,newR = 1,newNR =1;
        System.out.println("kombinasyon hesaplanacak sayıları girin: ");
        System.out.print("lütfen kombinasyon sayılarını girin: C(n,r)\n");
        System.out.print("n tam sayısını girin: ");
        n = input.nextInt();
        System.out.print("r tam sayısını girin: ");
        r = input.nextInt();

        if(r >= 0 && n >= r){
            for(i = 1; i <= n; i++)
                newN *= i;
            for (i = 1; i <= r ;i++)
                newR *=i;
            for (i = 1; i <= (n-r) ;i++)
                newNR *=i;

            sonuc = newN /(newR *newNR);
            System.out.print("kombinasyon sonucu: "+ sonuc);
        }
        else {
            System.out.print("kombinasyon değeri: tanımmsızdır");
        }
    }
}
