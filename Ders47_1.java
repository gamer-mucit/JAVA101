import java.util.Scanner;
public class Ders47_1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int sayi1,sayi2,ekok = 0,ebob = 0,enk,enc;
        System.out.print("1. sayıyı giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        sayi2 = input.nextInt();

        if(sayi1>sayi2) {
            enk = sayi2;
        }
        else{
            enk = sayi1;
        }

        while(enk != 0){
            if(sayi1 % enk == 0 && sayi2 % enk ==0){
                ebob = enk;
                break;
            }
            else
                enk--;
        }
        enk = sayi1*sayi2;
        enc = 1;
        while(enc != enk+1){
            if(enc % sayi1 == 0 && enc % sayi2 == 0){
                ekok = enc;
                break;
            }
            else
                enc++;
        }

        System.out.print("ekok: " + ekok + "\n" + "ebob: " + ebob);
    }
}
