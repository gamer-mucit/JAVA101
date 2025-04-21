import java.util.Scanner;
public class Ders33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isPasswordsuccess = false;
        int pass;
        int i =1,left = 100,right=200;
        int k;

       /* while(i < 5){
            System.out.println(i);
            k = i;
                while(k < 10){
                    System.out.print(k+",");
                    k++;
                }
                System.out.print("\n");
            i++;

        }*/

        /*while(++left < --right);
        //koşul  bittimine bir şey yazdırmak itiyorsak illa
        // while parantez ile yazmamıza gerek yok noktalı virgül ilede yazılabilir
        System.out.print(left);*/

        while (!isPasswordsuccess){
            System.out.print("şifre giriniz: ");
            pass = input.nextInt();
            if(pass == 123){
                System.out.println("doğru");
                isPasswordsuccess = true;
            }
            else {
                System.out.println("yanlış");
            }
        }

    }
}
