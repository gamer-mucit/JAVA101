import java.util.Scanner;
public class Ders47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2,ebob = 1;
        System.out.print("n1 sayısını girin: ");
        n1 = input.nextInt();

        System.out.print("n2 sayısını girin: ");
        n2 = input.nextInt();

        for(int i =1;i <= (n1*n2);i++){
            if(i % n1 == 0 && i % n2 ==0){
                System.out.println(i);
                break;
            }
        }

        for(int k =n1;k >= 1;k--){
            if(n1 % k == 0 && n2 % k == 0){
                ebob = k;
                System.out.println(ebob);
                break;
            }
        }

        System.out.print((n1*n2)/ebob);


        /*for (int i = 1;i<= n1;i++){
            if(n1 %i == 0 && n2 % i == 0){
                ebob =i;
            }
        }*/


    }
}
