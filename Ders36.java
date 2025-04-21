import  java.util.Scanner;
public class Ders36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,i;
        /*for(boolean run = true;run;){
            System.out.print("sayı giriniz: ");
            int sayi = input.nextInt();
            if(sayi<0)
                run = false;
        }*/

        /*System.out.print("sayı giriniz: ");
        sayi = input.nextInt();
        while(sayi > 0){
            System.out.print("sayı giriniz: ");
            sayi = input.nextInt();
        }*/

        /*do {
            System.out.print("sayı giriniz: ");
            sayi = input.nextInt();
        }while(sayi > 0);*/

        /*for(i = 0; i < 10; i++){
            System.out.println(i+"");
        }*/
        i = 0;
        while(i <= 10){
                System.out.print(i + " ");
                i++;
        }
    }
}
