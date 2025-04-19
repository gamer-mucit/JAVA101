import java.util.Scanner;
public class Odev05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;
        System.out.print("istenilen yılı girin: ");
        yil = input.nextInt();
        if(yil >= 0){
            if((yil % 400) == 0){
                System.out.print(yil + " bir artık yıldır");
            }else if ((yil % 4) ==0){
                System.out.print(yil + " bir artık yıldır");
            }
            else
                System.out.print( yil + " bir artık yıl değildi");
        }
        else
            System.out.print("tarihler negatif sayı olamaz");
    }
}
